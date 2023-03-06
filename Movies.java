import java.io.File;
import java.util.ArrayList;

public class Movies {

    private String movieId;
    private String title;
    private ArrayList<String> genre;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(String[] genre_array) {

        for(int i = 0; i <= genre_array.length; i++) {
            genre.add(genre_array[i]);
        }

    }

    public Movies() {

    }


}
