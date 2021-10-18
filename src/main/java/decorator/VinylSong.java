package decorator;

public class VinylSong extends SongDecorator {

    public VinylSong(SongComponent song) {
        super(song);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("ON vinyl");
    }
}
