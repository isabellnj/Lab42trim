package Lab42Trim.isabel.Repositories.Interfaces;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Lab42Trim.isabel.Repositories.Entities.Movie;
public interface MovieRepository extends JpaRepository<Movie, Long>{


    
    @Query(value = "SELECT p " + " FROM Movie p " + " WHERE p.title LIKE %:title% OR p.year = :year")
    List<Movie> findMovieByTitle(
        
                @Param("title") String tittle,  @Param("year") int year);
            
                    


}


    

