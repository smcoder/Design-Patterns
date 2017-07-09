package builder.example;

/**
 * Created by mac on 09/07/2017.
 */
public class MemoryModel extends VideoBuilder {

    @Override
    public void DisplayTheMenu() {

    }

    @Override
    public void playList() {
        System.out.println("play list of memory model");
    }

    @Override
    public void mainWindow() {
        System.out.println("main window of memory model");
    }

    @Override
    public void controlStrip() {
        System.out.println("control strip of memory model");
    }
}
