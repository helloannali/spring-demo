package demo;

/**
 * Author why
 * Date 16-5-4
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
