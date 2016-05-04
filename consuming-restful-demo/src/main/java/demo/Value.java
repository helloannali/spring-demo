package demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Author why
 * Date 16-5-4
 * Version : soc-ia-1.0
 * Copyright : cnpc
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private Long id;
    private String quote;

    public Value() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
