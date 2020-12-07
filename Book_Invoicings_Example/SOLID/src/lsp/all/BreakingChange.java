package lsp.all;

public class AudioBook extends Book {
    public Duration duration;
    
    public AudioBook(){
        this.numberOfPages = 0; //!AudioBooks do not have pages!
    }

    @Override
    public String getSpecificDetails() {
        return "Duration: " + duration.toString();
    }
}