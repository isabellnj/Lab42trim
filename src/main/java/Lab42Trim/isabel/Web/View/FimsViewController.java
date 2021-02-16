package Lab42Trim.isabel.Web.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Lab42Trim.isabel.Services.MovieService;
import Lab42Trim.isabel.Web.apii.ControladorPeliculas;

import org.springframework.web.bind.annotation.RequestParam;

@Controller


public class FimsViewController {

    private final MovieService movieService;

    FimsViewController(MovieService movieService) {

        this.movieService = movieService;
    }

    @GetMapping("listMovies")

    public ModelAndView movies() {
        ModelAndView modelo = new ModelAndView("listMovies");
        modelo.addObject("movies", movieService.getAll());
        return modelo;
    }

    // @GetMapping("/moviess/{id}")
    // public ModelAndView PeliculaDetail(@PathVariable("id") int id) {
    // ModelAndView mv = new ModelAndView("detailMovie");
    // mv.addObject("movies", movieService.findById(id);
    // return mv;

    // }

}