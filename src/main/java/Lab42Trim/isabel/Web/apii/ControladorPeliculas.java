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
    private final MovieService movieService;

    ControladorPeliculas(MovieService movieService) {

        this.movieService = movieService;
    }
 
    //Ejercicio3 --> sacar lista
    @GetMapping("/movies")
    public List<MovieDTO> getall(){

    return movieService.getAll();
    }

    //Ejercicio4--> filtrado de peliculas por año y/o titulo


    public List<MovieDTO> GetAllPeliculas() {
    

    return movieService.getAll();
      

    }


    public List<MovieDTO>GetTitle ( String title){
    ArrayList<MovieDTO>movie= new ArrayList<>();
        for (MovieDTO movie1 : movieService.getAll()) {
             if (movie1.getTitle().contains(title)){
               
                movie.add(new MovieDTO(movie1.getTitle(), movie1.getYear(), movie1.getPoster(), movie1.getSinopsis()));
            }
        }
        return movie;
    }


  



   
    


   
}



