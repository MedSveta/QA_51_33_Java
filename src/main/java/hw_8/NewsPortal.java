package hw_8;

import java.util.Objects;

public class NewsPortal extends MassMedia{
   private String url;

    public NewsPortal() {
    }

    public NewsPortal(String name, String url) {
        super(name);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if (url != null && !url.isBlank())
        this.url = url;
    }

    @Override
    public String
    toString() {
        return "NewsPortal{" +
                "url='" + url + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NewsPortal that = (NewsPortal) o;
        return Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), url);
    }
}
