package adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Electric red.mp3");
        audioPlayer.play("mp4", "Nostrum.mp4");
        audioPlayer.play("vlc", "Shed.vlc");
        audioPlayer.play("avi", "Straws pulled at random.avi");
    }
}
