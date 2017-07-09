package specific.example;

import java.util.Hashtable;

/**
 * Created by mac on 09/07/2017.
 */
public class PrototypeManager {

    // defined a Hashtable for storing prototype objects
    private Hashtable ht = new Hashtable();

    private static PrototypeManager pm = new PrototypeManager();

    // add a document object for hashtable
    private PrototypeManager() {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    // get a new document object via a shallow copy
    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument) ht.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager() {
        return pm;
    }
}
