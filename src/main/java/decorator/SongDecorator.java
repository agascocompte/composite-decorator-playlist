package decorator;

public class SongDecorator implements SongComponent {

    private SongComponent song;

    public SongDecorator (SongComponent song) {
        this.song = song;
    }

    @Override
    public void play() {
        song.play();
    }

    @Override
    public String getName() {
        return song.getName();
    }
}
