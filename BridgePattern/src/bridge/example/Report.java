package bridge.example;

/**
 * Created by mac on 09/07/2017.
 */
public abstract class Report {
    protected IDatabaseImp imp;

    public void setImp(IDatabaseImp imp) {
        this.imp = imp;
    }

    public abstract void generate(String fileName);
}
