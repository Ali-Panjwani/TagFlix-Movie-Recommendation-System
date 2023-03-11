import java.lang.reflect.Array;
import java.util.*;


public class MovieParser {

    HashMap<String, Links> mpLink = new HashMap<>();
    HashMap<String, Movies> mpMovie = new HashMap<>();
    HashMap<String, Ratings> mpRating = new HashMap<>();
    HashMap<String, Tags> mpTag = new HashMap<>();

    public MovieParser(String folderPath) {
        
        CsvReader cr = new LinksReader();
        cr.readCsvReader(folderPath+"\\links.csv");
        mpLink = (HashMap<String, Links>) cr.getMap();

        cr = new MoviesReader();
        cr.readCsvReader(folderPath+"\\movies.csv");
        mpMovie = (HashMap<String, Movies>) cr.getMap();

        cr = new RatingsReader();
        cr.readCsvReader(folderPath+"\\ratings.csv");
        mpRating = (HashMap<String, Ratings>) cr.getMap();

        cr = new TagsReader();
        cr.readCsvReader(folderPath+"\\tags.csv");
        mpTag = (HashMap<String, Tags>) cr.getMap();
    
    }

    public ArrayList<MovieEntry> getMovieObj(){
        ArrayList<MovieEntry> MovEntList = new ArrayList<MovieEntry>();
        Set<String> keySet = mpMovie.keySet();

        for(String key : keySet){
            MovieEntry MovEntObj = new MovieEntry();
            MovEntObj.meMovie = new Movies(mpMovie.get(key));
            MovEntObj.meTag = new Tags(mpTag.get(key));
            MovEntObj.meRating = new Ratings(mpRating.get(key));
            MovEntObj.meLink = new Links(mpLink.get(key));
            MovEntList.add(MovEntObj);
        }

        return MovEntList;
    }
}
