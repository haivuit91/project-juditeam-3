package jenajdo;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;

import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.graph.TripleMatch;
import com.hp.hpl.jena.graph.impl.GraphBase;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.util.iterator.NiceIterator;

public class GraphJDO extends GraphBase {
	private static final PersistenceManagerFactory pmf =
		JDOHelper.getPersistenceManagerFactory("transactions-optional");

	private PersistenceManager pm;

	public GraphJDO() { pm = pmf.getPersistenceManager(); }

	@Override
	public void performAdd( Triple t ) {
		if (this.jdoFind(t).isEmpty())
			pm.makePersistent(new TripleJDO(t));
	}

	@Override
	public void performDelete( Triple t ) { pm.deletePersistentAll(this.jdoFind(t)); }

	@Override
	public void close() {
		super.close();
		pm.close();
	}

	@Override
	protected ExtendedIterator<Triple> graphBaseFind(TripleMatch t) {
		final List<TripleJDO> triplesJDO = this.jdoFind(t);
		return new NiceIterator<Triple>() {
			private int ind = -1;
			
			@Override
			public boolean hasNext() { return this.ind < triplesJDO.size() - 1; }

			@Override
			public Triple next() {
				this.ind ++;
				return triplesJDO.get(this.ind).asTriple();
			}

			@Override
			public void remove() { pm.deletePersistentAll(triplesJDO.get(this.ind)); }
		};
	}

	@SuppressWarnings("unchecked")
	private List<TripleJDO> jdoFind(TripleMatch t) {
		HashMap<String, String> condMap = new HashMap<String, String>();
		if (t.getMatchSubject() != null)
			condMap.put("subjectParam", t.getMatchSubject().toString());
		if (t.getMatchPredicate() != null)
			condMap.put("predicateParam", t.getMatchPredicate().toString());
		if (t.getMatchObject() != null)
			condMap.put("objectParam", t.getMatchObject().toString());

		if (condMap.size() > 0) {
			String condString = "";
			String paramString = "";
			for (String node : condMap.keySet()) {
				condString += node.substring(0, node.length() - 5) + " == " + node + " && ";
				paramString += "String " + node + ", ";
			}
			
			Query query = pm.newQuery(TripleJDO.class, condString.substring(0, condString.length() - 4));
			query.declareParameters(paramString.substring(0, paramString.length() - 2));
			return (List<TripleJDO>)query.executeWithMap(condMap);
		} else
			return (List<TripleJDO>)pm.newQuery(TripleJDO.class).execute();
	}
	
	@SuppressWarnings("rawtypes")
	public void deleteAll() {
		pm.deletePersistentAll((Collection)pm.newQuery(TripleJDO.class).execute());
	}
}
