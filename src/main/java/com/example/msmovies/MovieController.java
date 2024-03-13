package com.example.msmovies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

public class MovieController {
    private List<Movie> movies = new ArrayList<>();

    public MovieController() {
        movies.add(new Movie(1, "The Matrix", "Acción", "1999", "The Wachowskis",
                "Representa un futuro distópico en el que la humanidad está atrapada sin saberlo dentro de una realidad simulada llamada Matrix."));
        movies.add(new Movie(2, "Star Wars", "Actión", "1977", "George Lucas",
                "La nave en la que viaja la princesa Leia es capturada por las tropas imperiales al mando del temible Darth Vader"));
        movies.add(new Movie(3, "Forest Gump", "Drama", "1994", "Robert Zemeckis",
                "Forrest Gump, un joven sureño, tenaz e inocente, es protagonista de acontecimientos cruciales en la historia de los Estados Unidos"));
        movies.add(new Movie(4, "Inception", "Acción", "2010", "Christopher Nolan",
                "Dom Cobb es un ladrón con una extraña habilidad para entrar a los sueños de la gente y robarle los secretos de sus subconscientes."));
        movies.add(new Movie(5, "The Godfather", "Drama", "1972", "Francis Ford Coppola",
                "Don Vito Corleone es el respetado y temido jefe de una de las cinco familias de la mafia de Nueva York en los años 40"));
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movies;
    }

    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

}
