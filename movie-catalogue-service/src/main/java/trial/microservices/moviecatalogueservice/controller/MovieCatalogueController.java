package trial.microservices.moviecatalogueservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trial.microservices.moviecatalogueservice.model.MovieCatalogueModel;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/moviecatalogue")
public class MovieCatalogueController {

    @RequestMapping("/{userId}")
    public List<MovieCatalogueModel> getMovieCatalogue(@PathVariable String userId){
        return Collections.singletonList(new MovieCatalogueModel("movie id", "movie name", "movie description", "user rating for movie"));
    }
}
