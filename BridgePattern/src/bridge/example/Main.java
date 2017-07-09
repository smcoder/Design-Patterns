package bridge.example;

/**
 * Created by mac on 09/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        IDatabaseImp imp = new MySqlImp();
        Report report = new PDFReport();
        report.setImp(imp);
        report.generate("mysql");
    }
}
