package builder.example;

/**
 * Created by mac on 09/07/2017.
 */
public class VideoController {
    public Video construct(VideoBuilder builder) {
        Video video;
        builder.controlStrip();
        builder.DisplayTheMenu();
        builder.playList();
        builder.mainWindow();

        video = builder.createVideo();

        return video;
    }
}
