package patterns.structural.proxy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class YoutubeCachedProxy implements YoutubeLib {
    YoutubeLib youtubeLib = new YoutubeClass();
    Set<Video> popular = new HashSet<>();
    Map<Integer,Video> all = new HashMap<>();

    @Override
    public Set<Video> getPopular() {
        if(popular.isEmpty()){
            popular = youtubeLib.getPopular();
        }
        return popular;
    }

    @Override
    public Video getVideo(Integer id) {
        if(all.containsKey(id)){
            return all.get(id);
        }
        Video video = youtubeLib.getVideo(id);
        all.put(id, video);
        return video;
    }

    public void reset(){
        popular.clear();
        all.clear();
    }
}
