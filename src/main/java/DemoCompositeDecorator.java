import decorator.MP4Song;
import decorator.Song;
import decorator.VinylSong;

public class DemoCompositeDecorator {
    public static void main(String[] args) {
        // Make "Sabina's hits" playlist and add 2 songs to it
        PlayList sabinaPlaylist = new PlayList("Sabina's hits");
        sabinaPlaylist.add(new VinylSong(new Song("Princesa", "Joaquín Sabina")));
        sabinaPlaylist.add(new Song("Calle melancolía", "Joaquín Sabina"));
        // Make "Manolo García's hits" playlist and add 3 song to it
        PlayList garciaPlaylist = new PlayList("Manolo Garcia's hits");
        garciaPlaylist.add(new MP4Song(new Song("Pájaros de barro", "Manolo García")));

        // Make "my songs" playlist and add the two playlists adn one single song
        PlayList mySongs = new PlayList("My Songs");
        mySongs.add(sabinaPlaylist);
        mySongs.add(garciaPlaylist);

        mySongs.play();
    }
}
