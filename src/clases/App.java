package clases;

public class App implements java.io.Serializable {

    String url;

    public App() {

    }

    public App(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "APP{" + "url=" + url + '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
