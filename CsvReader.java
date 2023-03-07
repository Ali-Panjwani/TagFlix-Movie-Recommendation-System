import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public interface CsvReader {
    void CsvReader(String filepath);
}

class MoviesReader implements CsvReader{
    HashMap<String,Movies> MovieMaps = new HashMap<>();
    @Override
    public void CsvReader(String filepath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line = "";

            while((line = br.readLine()) != null ) {
                Movies Movie = new Movies();
                String[] data = line.split(",");
                if(MovieMaps.containsKey(data[0])) {
                    continue;
                } else {
                    Movie.setMovieId(data[0]);
                    Movie.setTitle(data[1]);
                    Movie.setGenre(data[2].split("|"));
                    MovieMaps.put(data[0], Movie);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public HashMap<String, Movies> getMovieMap() {
        return MovieMaps;
    }
}

class LinksReader implements CsvReader{

    HashMap<String,Links> LinkMaps = new HashMap<>();
    @Override

    public void CsvReader(String filepath) {
        
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line = "";

            while((line = br.readLine()) != null ) {
                Links Link = new Links();
                String[] data = line.split(",");
                if(LinkMaps.containsKey(data[0])) {
                    continue;
                } else {
                    Link.setMovieId(data[0]);
                    Link.setImdbId(data[1]);
                    Link.setTmdbId(data[2]);
                    LinkMaps.put(data[0], Link);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public HashMap<String, Links> getLinksMap() {
        return LinkMaps;
    }
}

class RatingsReader implements CsvReader{

    HashMap<String, Ratings> RatingMap = new HashMap<>();

    @Override
    public void CsvReader(String filepath) {

        try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line = "";

            while((line = br.readLine()) != null) {
                Ratings Rating = new Ratings();
                String[] data = line.split(",");
                if(RatingMap.containsKey(data[1])){
                    continue;
                } else {
                    Rating.setMovieId(data[1]);
                    Rating.setRating(Integer.parseInt(data[2]));
                    RatingMap.put(data[1],Rating);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public HashMap<String, Ratings> getRatingMap(){
        return RatingMap;
    }
}

class TagsReader implements CsvReader{

    HashMap<String, Tags> TagMap = new HashMap<>();
    @Override
    public void CsvReader(String filepath) {

        try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line = "";

            while((line = br.readLine()) != null) {
                Tags Tag = new Tags();
                String[] data = line.split(",");
                if(TagMap.containsKey(data[1])){
                    Tags TempTag = TagMap.get(data[0]);
                    TempTag.setTags(data[2]);
                    TagMap.put(data[1],TempTag);
                } else {
                    Tag.setMovieId(data[1]);
                    Tag.setTags(data[2]);
                    TagMap.put(data[1],Tag);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public HashMap<String, Tags> getTagMap(){
        return TagMap;
    }
}