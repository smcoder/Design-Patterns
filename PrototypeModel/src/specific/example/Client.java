package specific.example;

/**
 * Created by mac on 09/07/2017.
 */
public class Client {
    public static void main(String[] args) {
        // get prototype manage object
        PrototypeManager pm = PrototypeManager.getPrototypeManager();

        OfficialDocument doc, doc1, doc2, doc3, doc4;
        doc = pm.getOfficialDocument("far");
        doc.display();
        doc1 = pm.getOfficialDocument("far");
        doc1.display();
        System.out.println(doc == doc1);

        doc2 = pm.getOfficialDocument("srs");
        doc2.display();
        doc3 = pm.getOfficialDocument("srs");
        doc3.display();
        System.out.println(doc2 == doc3);

    }
}
