package Lab42Trim.isabel.Web.apii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Lab42Trim.isabel.Repositories.Entities.Movie;
import Lab42Trim.isabel.Services.MovieService;
import Lab42Trim.isabel.Services.Models.MovieDTO;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorPeliculas {
    private MovieService movieService;

    ControladorPeliculas(MovieService movieService) {

        this.movieService = movieService;
    }



    @GetMapping("/movies")
    public List<MovieDTO> Get(@RequestParam(name="title", required = false, defaultValue = "") String title,
    @RequestParam(name="year", required = false, defaultValue = "0") int year ) {

    
     
        if (!title.equals("") || year != 0){
            return movieService.findBytittle(title, year);
        }else{


            return movieService.getAll();
        }


    }
}

    // // // Ejercicio3 --> sacar lista
    // // @GetMapping("/movies")
    // // public List<MovieDTO> getall() {

    // //     return movieService.getAll();
    // // }

   

  

    // Ejercicio5 --> CRUD

    // Filtrar pelicula por id
  


