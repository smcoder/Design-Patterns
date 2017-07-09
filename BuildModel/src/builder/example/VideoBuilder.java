package builder.example;

/**
 * Created by mac on 09/07/2017.
 */
public abstract class VideoBuilder {
    protected Video video = new Video();

    public abstract void DisplayTheMenu();

    public abstract void playList();

    public abstract void mainWindow();

    public abstract void controlStrip();

    public Video createVideo() {
        return video;
    }
}
