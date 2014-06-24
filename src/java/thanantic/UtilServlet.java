package thanantic;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jenajdo.JenaJDOFactory;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.vocabulary.OWL;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;

public class UtilServlet extends HttpServlet {
	private static final long serialVersionUID = 4693999972089748968L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Model model = JenaJDOFactory.createModelJDO();
		String command = req.getParameter("command");
		if (command.equals("TGSGR")) {
			model.removeAll();
			model.add(OWL.Thing, RDF.type, OWL.Class);
			model.add(OWL.Thing, RDFS.label, "Thing");
			model.add(OWL.Thing, RDFS.subClassOf, OWL.Thing);
		}
		model.close();
		resp.sendRedirect("/");
	}
}
