package specific.example;

/**
 * Created by mac on 09/07/2017.
 */
public class SRS implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("not support copy operation");
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("software requirements specification");
    }
}
