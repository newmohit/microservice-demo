package trial.microservices.movieinfoservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trial.microservices.movieinfoservice.model.MovieInfoModel;

@RestController
@RequestMapping("/movie")
public class MovieInfoController {

    @RequestMapping("/info/{movieId}")
    public MovieInfoModel getMovieInfo(@PathVariable String movieId){
        return new MovieInfoModel(movieId, "movie name", "movie description");
    }
}
