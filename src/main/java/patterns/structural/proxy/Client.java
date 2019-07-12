package patterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        YoutubeCachedProxy youtubeClassProxy = new YoutubeCachedProxy();
        youtubeClassProxy.getVideo(5);
        youtubeClassProxy.getVideo(5);
    }
}
