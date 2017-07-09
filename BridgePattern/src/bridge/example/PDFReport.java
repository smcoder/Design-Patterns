package bridge.example;

/**
 * Created by mac on 09/07/2017.
 */
public class PDFReport extends Report {

    @Override
    public void generate(String fileName) {
        Display display = new Display();
        imp.transform(display);
        System.out.println(fileName + ", the format is PDF");
    }
}
