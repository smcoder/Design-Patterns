package bridge.example;

/**
 * Created by mac on 09/07/2017.
 */
public class OracleImp implements IDatabaseImp {

    @Override
    public void transform(Display display) {
        System.out.println("oracle database transform");
    }
}
