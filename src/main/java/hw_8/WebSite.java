package hw_8;

import java.util.Objects;

public class WebSite extends NewsPortal {
    private String author;

    public WebSite() {
    }

    public WebSite(String name, String url, String author) {
        super(name, url);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isBlank())
        this.author = author;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "author='" + author + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WebSite webSite = (WebSite) o;
        return Objects.equals(author, webSite.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author);
    }

}
