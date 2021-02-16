package Lab42Trim.isabel.Repositories.Interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Lab42Trim.isabel.Repositories.Entities.Movie;
public interface MovieRepository extends JpaRepository<Movie, Long>{

  


}

    

