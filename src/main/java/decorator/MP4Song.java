package decorator;

public class MP4Song extends SongDecorator {

    public MP4Song(Song song) {
        super(song);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("ON MP4");
    }
}
