import java.util.HashMap;
import java.util.Map;

public class EntryPoint {
    public static void main(String[] args) {
        CsvReader cr = new LinksReader();
        cr.readCsvReader("data\\links.csv");
        HashMap<String, Links> link = (HashMap<String, Links>) cr.getMap();

        if (link.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            for(Map.Entry<String, Links> link1 : link.entrySet()){
                String key = link1.getKey();
                Links value = link1.getValue();

                System.out.println(key+": "+value.getImdbId()+"(IMDB) : "+value.getTmdbId()+"(TMDB)");
            }
        }

        cr = new MoviesReader();
        cr.readCsvReader("data\\movies.csv");
        HashMap<String, Movies> movie = (HashMap<String, Movies>) cr.getMap();

        if (movie.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            for(Map.Entry<String, Movies> movie1 : movie.entrySet()){
                String key = movie1.getKey();
                Movies value = movie1.getValue();

                System.out.println(key+": "+value.getTitle()+"(Title) : "+value.getGenre()+"(Genre)");
            }
        }

        cr = new RatingsReader();
        cr.readCsvReader("data\\ratings.csv");
        HashMap<String, Ratings> rating = (HashMap<String, Ratings>) cr.getMap();

        if (rating.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            for(Map.Entry<String, Ratings> rating1 : rating.entrySet()){
                String key = rating1.getKey();
                Ratings value = rating1.getValue();

                System.out.println(key+": "+value.getRating()+"(Avg_Rating) : "+value.getrating_count()+"(Count)");
            }
        }

        cr = new TagsReader();
        cr.readCsvReader("data\\tags.csv");
        HashMap<String, Tags> tag = (HashMap<String, Tags>) cr.getMap();

        if (tag.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            for(Map.Entry<String, Tags> tag1 : tag.entrySet()){
                String key = tag1.getKey();
                Tags value = tag1.getValue();

                System.out.println(key+": "+value.getTags()+"(Tags)");
            }
        }
    }
}
