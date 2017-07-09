package specific.example;

/**
 * Created by mac on 09/07/2017.
 */
public class FAR implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("not support copy that");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("feasibility analysis report");
    }
}
