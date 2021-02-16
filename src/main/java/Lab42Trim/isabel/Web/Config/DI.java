package Lab42Trim.isabel.Web.Config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Lab42Trim.isabel.Services.MovieService;


@Configuration
public class DI {
    @Bean
    MovieService createMovieService() {
        return new MovieService();
    }

   

    @Bean
    ModelMapper createModelMapper() {

        return new ModelMapper();
    }

    

}
