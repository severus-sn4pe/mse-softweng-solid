package lsp.bad1;

import java.time.Duration;

public class AudioBook extends Book {
    public Duration duration;
    
    public AudioBook(){
        this.numberOfPages = 0; //AudioBook has no pages.
    }

    @Override
    public String getSpecificDetails() {
        return "Duration: " + duration.toString();
    }
}
