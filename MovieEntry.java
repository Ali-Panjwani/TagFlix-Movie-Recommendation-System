import java.util.ArrayList;

public class MovieEntry implements Comparable<MovieEntry>{

    private String movieId;
    private String title;
    private ArrayList<String> genre;
    private int rating;
    private ArrayList<String> tags;
    private String imdbId;
    private String tmdbId;


    public MovieEntry() {
    }

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

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTmdbId() {
        return tmdbId;
    }

    public void setTmdbId(String tmdbId) {
        this.tmdbId = tmdbId;
    }



    @Override
    public int compareTo(MovieEntry o) {

        if (rating < o.rating) {
            return -1;
        } else if (rating == o.rating) {
            return 0;
        } else {
            return 1;
        }
    }



}
