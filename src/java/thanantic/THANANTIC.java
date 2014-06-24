package thanantic;

import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.ResourceFactory;

public class THANANTIC {
    public final static String NS = "http://thanantic.appspot.com/";
    public final static String ONTOLOGY_NS = NS + "ontology/";
    public final static String DATA_NS = NS + "data/";
    
    private static Property property( String local )
        { return ResourceFactory.createProperty( NS + local ); }

    public final static Property subClassOfDeleted = property( "subClassOfDeleted" );
    public final static Property ClassDeleted = property( "ClassDeleted" );
}
