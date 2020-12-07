package lsp.good1;

import java.time.Duration;

public class AudioBook extends Book {
    public Duration duration;

    @Override
    public String getSpecificDetails() {
        return "Duration: " + duration.toString();
    }

    @Override
    public boolean hasPages() {
        return false;
    }
}
