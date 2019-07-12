package patterns.structural.proxy;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class YoutubeClass implements YoutubeLib {

    @Override
    public Set<Video> getPopular() {
        experienceNetworkLatency();
        return IntStream.range(0,9).mapToObj(id -> new Video(id)).collect(Collectors.toSet());
    }

    @Override
    public Video getVideo(Integer id) {
        experienceNetworkLatency();
        return new Video(id);
    }

    private void experienceNetworkLatency(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
