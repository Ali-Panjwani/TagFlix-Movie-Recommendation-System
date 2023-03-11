import java.util.ArrayList;

public class MovieEntry{

    Movies movie = new Movies();
    Tags tag = new Tags();
    Ratings rating = new Ratings();
    Links link = new Links();

    public void setMovie(Movies movie) {
        this.movie = movie;
    }

    public void setTag(Tags tag) {
        this.tag = tag;
    }

    public void setRating(Ratings rating) {
        this.rating = rating;
    }

    public void setLink(Links link) {
        this.link = link;
    }

    public Movies getMovie() {
        return movie;
    }

    public Tags getTag() {
        return tag;
    }

    public Ratings getRating() {
        return rating;
    }

    public Links getLink() {
        return link;
    }
}

