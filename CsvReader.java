import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public interface CsvReader {
    void readCsvReader(String filepath);
    public HashMap<String, ? extends Object> getMap();
}

class MoviesReader implements CsvReader{
    HashMap<String, Movies> movieMap = new HashMap<>();
    @Override
    public void readCsvReader(String filepath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line = "";
            br.readLine();
            while((line = br.readLine()) != null ) {
                Movies Movie = new Movies();
                String[] data = line.split(",");
                if(movieMap.containsKey(data[0])) {
                    continue;
                } else {
                    Movie.setMovieId(data[0]);
                    Movie.setTitle(data[1]);
                    Movie.setGenre(data[2].split("\\|"));
                    movieMap.put(data[0], Movie);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HashMap<String,Movies> getMap() {
        return movieMap;
    }
}

class LinksReader implements CsvReader{

    HashMap<String, Links> linkMap = new HashMap<>();

    @Override
    public void readCsvReader(String filepath) {
        
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line = "";
            br.readLine();
            while((line = br.readLine()) != null ) {
                Links Link = new Links();
                String[] data = line.split(",");
                if (data.length < 3) {
                    // Skip lines with less than three fields
                    continue;
                }

                if(linkMap.containsKey(data[0])) {
                    continue;
                } else {
                    Link.setMovieId(data[0]);
                    Link.setImdbId(data[1]);
                    Link.setTmdbId(data[2]);
                    linkMap.put(data[0], Link);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public HashMap<String, Links> getMap() {
        return linkMap;
    }
}

class RatingsReader implements CsvReader{

    HashMap<String, Ratings> ratingMap = new HashMap<>();

    @Override
    public void readCsvReader(String filepath) {


        try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line = "";
            br.readLine();

            while((line = br.readLine()) != null) {
                Ratings Rating = new Ratings();
                String[] data = line.split(",");

                if (ratingMap.containsKey(data[1])) {
                    Ratings tempRating = ratingMap.get(data[1]);
                    tempRating.setRating(data[2]);
                    ratingMap.put(data[1], tempRating);

                } else {
                    Rating.setMovieId(data[1]);
                    Rating.setRating(data[2]);

                    ratingMap.put(data[1], Rating);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public HashMap<String, Ratings> getMap(){
        return ratingMap;
    }
}

class TagsReader implements CsvReader{

    HashMap<String, Tags> tagMap = new HashMap<>();
    @Override
    public void readCsvReader(String filepath) {

        try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line = "";
            br.readLine();
            while((line = br.readLine()) != null) {
                Tags Tag = new Tags();
                String[] data = line.split(",");
                if(data[2] != null) {
                    if (tagMap.containsKey(data[1])) {
                        Tags TempTag = tagMap.get(data[1]);
                        TempTag.setTags(data[2]);
                        tagMap.put(data[1], TempTag);
                    } else {
                        Tag.setMovieId(data[1]);
                        Tag.setTags(data[2]);
                        tagMap.put(data[1], Tag);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public HashMap<String,Tags> getMap(){
        return tagMap;
    }
}