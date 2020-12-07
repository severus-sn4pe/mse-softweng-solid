package lsp.good3;

import java.time.Duration;

public class AudioBook extends Book {
    public Duration duration;

    @Override
    public String getSpecificDetails() {
        return duration.toString();
    }
}