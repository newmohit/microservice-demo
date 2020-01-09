package trial.microservices.usermovieratingservice.model;

public class UserMovieRatingModel {
    private String userId;
    private String movieId;
    private String userMovieRating;

    public UserMovieRatingModel() {
        //intentionally created default constructor so that deserialization can be supported
    }

    public UserMovieRatingModel(String userId, String movieId, String userMovieRating) {
        this.userId = userId;
        this.movieId = movieId;
        this.userMovieRating = userMovieRating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getUserMovieRating() {
        return userMovieRating;
    }

    public void setUserMovieRating(String userMovieRating) {
        this.userMovieRating = userMovieRating;
    }
}
