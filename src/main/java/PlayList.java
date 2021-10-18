import decorator.SongComponent;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements SongComponent {
    private List<SongComponent> playlist;
    private String playlistName;

    public PlayList(String playlistName) {
        playlist = new ArrayList<>();
        this.playlistName = playlistName;
    }

    @Override
    public void play() {
        for (SongComponent songComponent : playlist) {
            System.out.println("-----" + playlistName + "-----");
            songComponent.play();
        }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

    public void add(SongComponent songComponent) {
        playlist.add(songComponent);
    }

    public void remove(SongComponent songComponent) { playlist.remove(songComponent); }
}
