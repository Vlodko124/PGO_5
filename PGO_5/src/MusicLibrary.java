import java.util.ArrayList;
import java.util.stream.Collectors;

public class MusicLibrary {
    private String name;
    private String owner;
    private ArrayList<String> tracks;
    private ArrayList<Playlist> playlists;

    public MusicLibrary(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.tracks = new ArrayList<>();
        this.playlists = new ArrayList<>();
    }

    public void addTrack(String track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }

    public void removeTrack(String track) {
        if (tracks.remove(track)) {
            for (Playlist playlist : playlists) {
                playlist.removeTrack(track);
            }
        }
    }

    public void displayTracks() {
        for (String track : tracks) {
            System.out.println(track);
        }
    }

    public void searchTracks(String phrase) {
        tracks.stream()
                .filter(track -> track.toLowerCase().contains(phrase.toLowerCase()))
                .forEach(System.out::println);
    }

    public void createPlaylist(String playlistName) {
        if (findPlaylist(playlistName) == null) {
            playlists.add(new Playlist(playlistName));
        }
    }

    private Playlist findPlaylist(String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(playlistName)) {
                return playlist;
            }
        }
        return null;
    }

    public void addTrackToPlaylist(String track, String playlistName) {
        Playlist playlist = findPlaylist(playlistName);
        if (playlist != null && tracks.contains(track)) {
            playlist.addTrack(track);
        }
    }

    public void displayPlaylist(String playlistName) {
        Playlist playlist = findPlaylist(playlistName);
        if (playlist != null) {
            playlist.displayTracks();
        }
    }

    public void displayAllPlaylists() {
        for (Playlist playlist : playlists) {
            System.out.println(playlist.getName());
        }
    }

    public int getTrackCount() {
        return tracks.size();
    }

    public int getPlaylistCount() {
        return playlists.size();
    }
}
