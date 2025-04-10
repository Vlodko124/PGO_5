public class Main {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary("Vocaloids", "Vlodko");

        myLibrary.addTrack("Hasane Teto - Fukkiteta");
        myLibrary.addTrack("Hatsune Miku - Evan Polka");
        myLibrary.addTrack("Sasuke Haraguchi  - Medicine");
        myLibrary.addTrack("Kikuo - しかばねの踊り");
        myLibrary.addTrack("Sasuke Haraguchi - Hito Mania");

        myLibrary.displayTracks();

        myLibrary.createPlaylist("Favorites");
        myLibrary.createPlaylist("Party");

        myLibrary.addTrackToPlaylist("Hasane Teto - Fukkiteta", "Favorites");
        myLibrary.addTrackToPlaylist("Sasuke Haraguchi  - Medicine", "Favorites");
        myLibrary.addTrackToPlaylist("Kikuo - しかばねの踊り", "Party");
        myLibrary.addTrackToPlaylist("Hatsune Miku - Evan Polka", "Party");

        myLibrary.displayAllPlaylists();
        myLibrary.displayPlaylist("Favorites");
        myLibrary.displayPlaylist("Party");

        myLibrary.searchTracks("Kikuo");

        myLibrary.removeTrack("Hatsune Miku - Evan Polka");
        myLibrary.displayPlaylist("Party");

        System.out.println("Total number of tracks in the library: " + myLibrary.getTrackCount());
        System.out.println("Total number of playlists: " + myLibrary.getPlaylistCount());
    }
}
