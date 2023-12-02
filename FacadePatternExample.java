class AudioPlayer {
    void on() { System.out.println("Audio Player is ON"); }
    void play(String audio) { System.out.println("Playing audio: " + audio); }
    void off() { System.out.println("Audio Player is OFF"); }
}

class VideoPlayer {
    void on() { System.out.println("Video Player is ON"); }
    void play(String video) { System.out.println("Playing video: " + video); }
    void off() { System.out.println("Video Player is OFF"); }
}

class Projector {
    void on() { System.out.println("Projector is ON"); }
    void display(String source) { System.out.println("Displaying on projector from: " + source); }
    void off() { System.out.println("Projector is OFF"); }
}

class MultimediaFacade {
    private AudioPlayer audioPlayer = new AudioPlayer();
    private VideoPlayer videoPlayer = new VideoPlayer();
    private Projector projector = new Projector();

    void startMovie(String audio, String video) {
        audioPlayer.on(); audioPlayer.play(audio);
        videoPlayer.on(); videoPlayer.play(video);
        projector.on(); projector.display("Movie");
        System.out.println("Enjoy your movie!");
    }

    void stopMovie() {
        audioPlayer.off();
        videoPlayer.off();
        projector.off();
        System.out.println("Movie stopped. Have a good day!");
    }
}

public class FacadePatternExample {
    public static void main(String[] args) {
        MultimediaFacade facade = new MultimediaFacade();
        facade.startMovie("BackgroundMusic.mp3", "Movie.mp4");
        facade.stopMovie();
    }
}
