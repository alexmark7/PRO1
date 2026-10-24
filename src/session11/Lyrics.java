package session11;

public class Lyrics {

    private final String text;

    public Lyrics(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public int getWordCount() {
        if (text.isBlank()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }
}
