package jenajdo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.hp.hpl.jena.datatypes.TypeMapper;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.rdf.model.AnonId;

@PersistenceCapable
public class TripleJDO {
	@SuppressWarnings("unused")
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private String subject;
	@Persistent
	private String predicate;
	@Persistent
	private String object;

	public TripleJDO(String subject, String predicate, String object) {
		this.subject = subject;
		this.predicate = predicate;
		this.object = object;
	}

	public TripleJDO(Triple triple) {
		this.subject = triple.getSubject().toString();
		this.predicate = triple.getPredicate().toString();
		this.object = triple.getObject().toString();
	}

	public Triple asTriple() {
		Node outSubject;
		if (this.subject.startsWith("_:"))
			outSubject = Node.createAnon(AnonId.create(this.subject.substring(2)));
		else
			outSubject = Node.createURI(this.subject);
		
		Node outObject;
		if (this.object.startsWith("_:"))
			outObject = Node.createAnon(AnonId.create(this.object.substring(2)));
		else if (this.object.charAt(0) == '"') {
			if (this.object.charAt(this.object.length() - 1) == '"')
				outObject = Node.createLiteral(this.object.substring(1, this.object.length() - 1));
			else {
				int typeInd = this.object.lastIndexOf("\"^^") + 3;
				outObject = Node.createLiteral(this.object.substring(1, typeInd - 4), null,
					TypeMapper.getInstance().getTypeByName(this.object.substring(typeInd, this.object.length() - typeInd)));
			}
		}
		else
			outObject = Node.createURI(this.object);

		return new Triple(outSubject, Node.createURI(this.predicate), outObject);
	}
}
