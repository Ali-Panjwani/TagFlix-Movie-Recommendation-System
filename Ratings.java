import java.io.File;
import java.util.ArrayList;

public class Ratings {

    private String movieId;
    private float rating = 0;
    private float rating_count;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(String new_rating_str) {
        float new_rating = 0;
        try {
            if (new_rating_str.contains(".")) {
                new_rating = Float.parseFloat(new_rating_str);
            } else {
                new_rating = (float) Integer.parseInt(new_rating_str);
            }
        } catch(NumberFormatException e){
            System.out.println("Issue: "+new_rating_str);
        }
        rating_count++;

        float prev_rating = this.rating;
        this.rating = (((rating * (rating_count-1)) + new_rating) / rating_count);
    }


    public float getrating_count() {
        return rating_count;
    }

    public Ratings() {

    }
}
