import java.util.ArrayList;
import java.util.Set;

public class MovieEntry{

    Movies meMovie = new Movies();
    Tags meTag = new Tags();
    Ratings meRating = new Ratings();
    Links meLink = new Links();

    public void setMovie(Movies movie) {
        this.meMovie = movie;
    }

    public void setTag(Tags tag) {
        this.meTag = tag;
    }

    public void setRating(Ratings rating) {
        this.meRating = rating;
    }

    public void setLink(Links link) {
        this.meLink = link;
    }

    public Movies getMovie() {
        return meMovie;
    }

    public Tags getTag() {
        return meTag;
    }

    public Ratings getRating() {
        return meRating;
    }

    public Links getLink() {
        return meLink;
    }

    public void printMovObj(MovieEntry meObj){
        System.out.println(meObj);
    }
}

