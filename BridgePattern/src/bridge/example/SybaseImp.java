package bridge.example;

/**
 * Created by mac on 09/07/2017.
 */
public class SybaseImp implements IDatabaseImp {
    @Override
    public void transform(Display display) {
        System.out.println("sybase database transform");
    }
}
