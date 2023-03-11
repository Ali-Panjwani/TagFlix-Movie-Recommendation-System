import java.io.File;
import java.util.ArrayList;

public class Ratings {

    private String movieId;
    private float rating = 0;
    private float ratingCount;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(String newRatingStr) {
        float newRating = 0;
        try {
            if (newRatingStr.contains(".")) {
                newRating = Float.parseFloat(newRatingStr);
            } else {
                newRating = (float) Integer.parseInt(newRatingStr);
            }
        } catch(NumberFormatException e){
            System.out.println("Issue: "+newRatingStr);
        }
        ratingCount++;

        float prev_rating = this.rating;
        this.rating = (((rating * (ratingCount-1)) + newRating) / ratingCount);
    }


    public float GetRatingCount() {
        return ratingCount;
    }

    public Ratings() {
    }

    public Ratings(Ratings rObj){
        this.movieId = rObj.getMovieId();
        this.rating = rObj.getRating();
        this.ratingCount = rObj.GetRatingCount();;
    }
}
