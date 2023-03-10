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

    public void setTags(String tag_str) {
    tags.add(tag_str);
    }

    public Tags() {
        tags = new ArrayList<String>();
    }

    public Tags(Tags tObj){
        tags = new ArrayList<String>();
        this.movieId = tObj.getMovieId();
        this.tags = tObj.getTags();
    }
}