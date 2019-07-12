package patterns.structural.proxy;

import java.util.Set;

public interface YoutubeLib {
    Set<Video> getPopular();
    Video getVideo(Integer id);
}
