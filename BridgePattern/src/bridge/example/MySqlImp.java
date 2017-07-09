package bridge.example;

/**
 * Created by mac on 09/07/2017.
 */
public class MySqlImp implements IDatabaseImp {
    @Override
    public void transform(Display display) {
        System.out.println("Mysql database transform");
    }
}
