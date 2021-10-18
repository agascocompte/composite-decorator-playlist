package decorator;

public class SongDecorator implements SongComponent {

    private Song song;

    public SongDecorator (Song song) {
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
