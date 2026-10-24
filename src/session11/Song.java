package session11;

public class Song {

    private final String title;
    private final String artist;
    private final Lyrics lyrics;
    private final Duration duration;

    public Song(String title, String artist, String lyricsText, int minutes, int seconds) {
        this.title = title;
        this.artist = artist;
        this.lyrics = new Lyrics(lyricsText);
        this.duration = new Duration(minutes, seconds);
    }

    public Lyrics getLyrics() {
        return new Lyrics(lyrics.getText());
    }

    public Duration getDuration() {
        return new Duration(duration.getMinutes(), duration.getSeconds());
    }

    public void displaySongInfo() {
        IO.println("Title: " + title);
        IO.println("Artist: " + artist);
        IO.println("Duration: " + duration.getFormattedDuration());
        IO.println("Lyrics: " + lyrics.getText());
        IO.println("Word count: " + lyrics.getWordCount());
    }
}
