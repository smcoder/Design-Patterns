package builder.example;

/**
 * Created by mac on 09/07/2017.
 */
public class StreamLinedModel extends VideoBuilder {
    @Override
    public void DisplayTheMenu() {

    }

    @Override
    public void playList() {
    }

    @Override
    public void mainWindow() {
        video.setMainWindow("main window of streamLined model");
    }

    @Override
    public void controlStrip() {
        video.setControlStrip("control strip of streamLined model");
    }
}
