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

        ArrayList<String> tempGenre = new ArrayList<>();

        for(int i = 0; i < genre_array.length; i++){
            tempGenre.add(genre_array[i]);
        }

        this.genre = tempGenre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public Movies() {

    }

    public Movies(Movies mObj){
        this.movieId = mObj.getMovieId();
        this.title = mObj.getTitle();
        this.genre = mObj.getGenre();
    }


}
