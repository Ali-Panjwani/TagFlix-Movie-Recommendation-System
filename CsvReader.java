import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public interface CsvReader {

    void CsvReader(String filepath);

}

class MoviesReader implements CsvReader{

    HashMap<String,Movies> movieMaps = new HashMap<>();

    @Override
    public void CsvReader(String filepath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line = "";

            while((line = br.readLine()) != null ) {
                Movies movie = new Movies();
                String[] data = line.split(",");
                if(movieMaps.containsKey(data[0])) {
                    continue;
                } else {
                    movie.setMovieId(data[0]);
                    movie.setTitle(data[1]);
                    movie.setGenre(data[2].split("|"));
                    movieMaps.put(data[0], movie);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public HashMap<String, Movies> getMovieMap() {
        return movieMaps;
    }
}

class LinksReader implements CsvReader{
    @Override
    public void CsvReader(String filepath) {

    }
}

class RatingsReader implements CsvReader{
    @Override
    public void CsvReader(String filepath) {

    }
}

class TagsReader implements CsvReader{
    @Override
    public void CsvReader(String filepath) {

    }
}