package adapter;


public class MediaAdapterClass implements AdvancedMediaPlayer, MediaPlayer{

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            playMp4(fileName);
        }
    }

    @Override
    public void playVlc(String fileName) {
        new VlcPlayer().playVlc(fileName);
    }

    @Override
    public void playMp4(String fileName) {
        new Mp4Player().playMp4(fileName);
    }
}
