package Lab42Trim.isabel.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import Lab42Trim.isabel.Repositories.Entities.Movie;
import Lab42Trim.isabel.Repositories.Interfaces.MovieRepository;
import Lab42Trim.isabel.Services.Models.MovieDTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;


public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<MovieDTO> getAll() {
        return movieRepository.findAll().stream().map(x -> modelMapper.map(x, MovieDTO.class))
                .collect(Collectors.toList());
    }

    public MovieDTO add(MovieDTO user) {
        Movie entityToInsert = modelMapper.map(user, Movie.class);
        Movie result = movieRepository.save(entityToInsert);
        return modelMapper.map(result, MovieDTO.class);

    }

    public MovieDTO update(Long ID, MovieDTO user) {

        Movie entityToInsert = modelMapper.map(user, Movie.class);
        Movie result = movieRepository.save(entityToInsert);
        return modelMapper.map(result, MovieDTO.class);
    }

    public void delete(Long ID) {
        Optional<Movie> entityToDelete = movieRepository.findById(ID);
        if (entityToDelete.isPresent()) {
            movieRepository.delete(entityToDelete.get());
        }

    }

    
    public Optional<MovieDTO> findById(Long ID) {
        Optional<Movie> entity = movieRepository.findById(ID);
        if (entity.isPresent()) {
            return Optional.of(modelMapper.map(entity.get(), MovieDTO.class));
        }else{

            return Optional.empty();
        }

    }

    


   
   
}
