package builder.example;

/**
 * Created by mac on 09/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        VideoBuilder videoBuilder = new StreamLinedModel();

        VideoController videoController = new VideoController();
        Video video = videoController.construct(videoBuilder);

        System.out.println(video.getControlStrip());
        System.out.println(video.getMainWindow());
    }
}
