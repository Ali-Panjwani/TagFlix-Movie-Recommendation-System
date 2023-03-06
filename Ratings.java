import java.io.File;
import java.util.ArrayList;

public class Ratings {

    private String movieId;
    private int rating;
    private int rating_count;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int new_rating) {
        rating_count++;

        int prev_rating = rating;
        this.rating = ((rating * (rating_count-1)) + new_rating) / rating_count;
    }

    public int getrating_count() {
        return rating_count;
    }

    public Ratings() {

    }
}
