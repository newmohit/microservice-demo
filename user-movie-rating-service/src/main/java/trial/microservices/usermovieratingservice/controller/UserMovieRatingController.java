package trial.microservices.usermovieratingservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trial.microservices.usermovieratingservice.model.UserMovieRatingModel;

@RestController
@RequestMapping("rating")
public class UserMovieRatingController {
    @RequestMapping("/{userId}/{movieId}")
    public UserMovieRatingModel getUserMovieRating(@PathVariable String userId,@PathVariable String movieId){
        return new UserMovieRatingModel(userId, movieId, "4");
    }
}
