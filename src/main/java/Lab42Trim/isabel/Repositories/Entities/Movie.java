package Lab42Trim.isabel.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Movie") // sobre base de datos
@Entity(name = "Movie") // sobre memoria
public class Movie {
    public Movie() {
    }

    public Movie(final String _title, final int _year, final String _poster, final String _sinopsis) {

        this.title = _title;
        this.year = _year;
        this.poster = _poster;
        this.sinopsis = _sinopsis;

    }

    public Movie(String title2) {
    }

    private @Id @GeneratedValue Long id;
    private String title;
    private int year;
    private String poster;
    private String sinopsis;

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
