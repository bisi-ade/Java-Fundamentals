import java.util.HashMap;
import java.util.Set;


// Create a trackList of type HashMap

public class SongList {
    public static void main(String[] args) {
        HashMap<String, String> soundTrack = new HashMap<String, String>();
        // Add in at least 4 songs that are stored by title
        soundTrack.put("Fall", "A Good Time");
        soundTrack.put("The Best", "A Better Time");
        soundTrack.put("Anybody", "African Giant");
        soundTrack.put("Ye", "Outside");

        // Pull out one of the songs by its track title
        System.out.println(soundTrack.get("Fall"));

        // Print out all the track names and lyrics in the format Track: Lyrics
        Set<String> keys = soundTrack.keySet();
            for(String key : keys) {
                System.out.println("Title" + key);
                System.out.println("Track"+ " : " + soundTrack.get(key));
            }

    }
}