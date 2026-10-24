package session11;

public class Duration {

    private final int minutes;
    private final int seconds;

    public Duration(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getTotalSeconds() {
        return minutes * 60 + seconds;
    }

    public String getFormattedDuration() {
        return "%d:%02d".formatted(minutes, seconds);
    }
}
