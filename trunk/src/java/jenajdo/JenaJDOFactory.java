package jenajdo;

import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.ontology.ProfileRegistry;
import com.hp.hpl.jena.rdf.model.impl.ModelCom;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class JenaJDOFactory {
	public static Graph createGraphJDO() { return new GraphJDO(); }
	public static Model createModelJDO() { return new ModelCom(JenaJDOFactory.createGraphJDO()); }
	public static OntModel createOntModelJDO() {
		return ModelFactory.createOntologyModel(OntModelSpec.getDefaultSpec(ProfileRegistry.OWL_LANG),
			JenaJDOFactory.createModelJDO());
	}
}
