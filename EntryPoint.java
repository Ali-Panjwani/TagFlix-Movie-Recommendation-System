import java.util.HashMap;
import java.util.Map;

public class EntryPoint {
    public static void main(String[] args) {
        LinksReader linksReader = new LinksReader();
        linksReader.CsvReader("data\\links.csv");
        HashMap<String, Links> link = linksReader.getLinksMap();

        if (link.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            for(Map.Entry<String, Links> link1 : link.entrySet()){
                String key = link1.getKey();
                Links value = link1.getValue();

                System.out.println(key+": "+value.getImdbId()+"(IMDB) : "+value.getTmdbId()+"(TMDB)");
            }
        }
    }
}
