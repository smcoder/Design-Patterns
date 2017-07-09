package specific.example;

/**
 * Created by mac on 09/07/2017.
 */
public class PPR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument ppr = null;
        try {
            ppr = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("not support copy operation");
        }
        return ppr;
    }

    @Override
    public void display() {
        System.out.println("project progress report");
    }
}
