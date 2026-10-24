package session11;

public class SongMain {

    static void main() {
        Song song = new Song(
                "Mamma-Mia",
                "ABBA",
                "Mamma-mia, Here we go again",
                3,
                5);

        song.displaySongInfo();

        IO.println("Total seconds: " + song.getDuration().getTotalSeconds());
    }
}
