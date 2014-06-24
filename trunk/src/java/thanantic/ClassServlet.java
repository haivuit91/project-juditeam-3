package thanantic;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import com.hp.hpl.jena.vocabulary.OWL;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;

import jenajdo.JenaJDOFactory;

public class ClassServlet extends HttpServlet {
	private static final long serialVersionUID = 9045782620452547260L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Model model = JenaJDOFactory.createModelJDO();
		Resource inClass = model.getResource(req.getParameter("inClass"));
		String buttonVal = req.getParameter("cSubmit");
		Resource parentClass = inClass.getPropertyResourceValue(RDFS.subClassOf);
		String inLabel = req.getParameter("cLabel");
		if (parentClass == null || inLabel == null || buttonVal == null)
			throw new IOException("Invalid parameters!");

		String respURI = ThananticUtil.getURI(inClass);
		String errorMessage = null;
		if (buttonVal.equals("New Class")) {
			QueryExecution qExec = ThananticUtil.runQuery(model,  
				"select ?class where {" +
				"	?class rdfs:subClassOf <" + inClass.toString() + "> ;" +
				"		rdfs:label \"" + inLabel + "\" ." +
				"}");
			ResultSet results = qExec.execSelect();
			if (results.hasNext()) {
				errorMessage = "This class already has a subclass with that label!";
			} else {
				respURI = THANANTIC.DATA_NS + UUID.randomUUID();
				Resource newResource = ResourceFactory.createResource(respURI);
				model.add(ResourceFactory.createStatement(newResource, RDFS.label,
					ResourceFactory.createPlainLiteral(inLabel)));
				model.add(ResourceFactory.createStatement(newResource, RDFS.subClassOf, inClass));
				model.add(ResourceFactory.createStatement(newResource, RDF.type, OWL.Class));
			}
			qExec.close();
		} else if (buttonVal.equals("New Property")) {
			QueryExecution qExec = ThananticUtil.runQuery(model,  
				"select ?property where {" +
				"	?property rdfs:domain <" + inClass.toString() + "> ;" +
				"		rdfs:label \"" + inLabel + "\" ." +
				"}");
			ResultSet results = qExec.execSelect();
			if (results.hasNext()) {
				errorMessage = "This class already has a property with that label!";
			} else {
				String dataType = req.getParameter("objectClass");
				Resource newResource = ResourceFactory.createResource(THANANTIC.DATA_NS + dataType);
				model.add(ResourceFactory.createStatement(newResource, RDFS.label,
					ResourceFactory.createPlainLiteral(inLabel)));
				model.add(ResourceFactory.createStatement(newResource, RDFS.domain, inClass));
				model.add(ResourceFactory.createStatement(newResource, RDFS.range, RDFS.Literal));
			}
			qExec.close();
		} else if (buttonVal.equals("Delete Class")) {
			respURI = ThananticUtil.getURI(OWL.Thing); // Must replace
			model.remove(inClass, RDFS.subClassOf, parentClass);
			model.add(inClass, THANANTIC.subClassOfDeleted, parentClass);
			model.remove(inClass, RDF.type, OWL.Class);
			model.add(inClass, RDF.type, THANANTIC.ClassDeleted);
		} else
			throw new IOException("Invalid button!");

		model.close();

		String respURL = "/crud.jsp?ontclass=" + respURI;
		if (errorMessage != null)
			respURL += "&errorMessage=" + errorMessage;
		resp.sendRedirect(respURL);
	}
}
