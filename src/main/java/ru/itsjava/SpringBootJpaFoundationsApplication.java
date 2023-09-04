package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itsjava.service.FilmService;
import ru.itsjava.service.GenreService;

import java.sql.SQLException;


@SpringBootApplication
public class SpringBootJpaFoundationsApplication {

    public static void main(String[] args) throws SQLException {
        var context = SpringApplication.run(SpringBootJpaFoundationsApplication.class, args);

        FilmService filmService = context.getBean(FilmService.class);
        filmService.printAllFilms();

        GenreService genreService = context.getBean(GenreService.class);
        genreService.changeGenre("fantasy", "comedy");
        genreService.printGenre("comedy");

    }
}
