import java.io.File;
import java.util.ArrayList;

public class Tags {
    private String movieId;

    private ArrayList<String> tags;


    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public Tags() {

    }
}