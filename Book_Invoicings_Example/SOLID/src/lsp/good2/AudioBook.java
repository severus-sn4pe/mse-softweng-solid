package lsp.good2;

import java.time.Duration;

public class AudioBook implements IProduct {
    public String name;
	public String author;
    public Duration duration;

	@Override
	public String getDetails() {
		return name + " "
		+ "by " + author + ". "
		+ "Duration: " + duration.toString();
	}
}