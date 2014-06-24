package thanantic;

import java.io.UnsupportedEncodingException;

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.vocabulary.OWL;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;
import java.net.URLEncoder;
import java.util.*;

import java.util.ArrayList;
public class ThananticUtil {
	public static final ArrayList<String> dataTypes = new ArrayList<String> ();
	
	public static String getLabel(Resource res) {
		Statement stmt = res.getProperty(RDFS.label);
		if (stmt != null)
			return stmt.getString();
		else
			return res.getLocalName();
	}

	public static String getURI(Resource res) throws UnsupportedEncodingException
		{ return URLEncoder.encode(res.toString(), "UTF-8"); }

	public static QueryExecution runQuery(Model model, String query) {
		return QueryExecutionFactory.create(
				"PREFIX rdf: <" + RDF.getURI() + "> " + 
				"PREFIX rdfs: <" + RDFS.getURI() + "> " + 
				"PREFIX owl: <" + OWL.getURI() + "> " +
				"PREFIX thanont: <" + THANANTIC.ONTOLOGY_NS + "> " + 
				"PREFIX thandat: <" + THANANTIC.DATA_NS + "> " + 
				query, model);
	}
}
