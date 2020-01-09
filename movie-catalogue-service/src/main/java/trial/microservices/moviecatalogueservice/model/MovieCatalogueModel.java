package trial.microservices.moviecatalogueservice.model;

public class MovieCatalogueModel {
    private String movieId;
    private String movieName;
    private String movieDescription;
    private String userMovieRating;

    public MovieCatalogueModel() {
    }

    public MovieCatalogueModel(String movieId, String movieName, String movieDescription, String userMovieRating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDescription = movieDescription;
        this.userMovieRating = userMovieRating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getUserMovieRating() {
        return userMovieRating;
    }

    public void setUserMovieRating(String userMovieRating) {
        this.userMovieRating = userMovieRating;
    }
}
