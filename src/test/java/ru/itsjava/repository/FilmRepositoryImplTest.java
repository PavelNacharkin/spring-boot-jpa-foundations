package ru.itsjava.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import ru.itsjava.domain.Film;
import ru.itsjava.repository.FilmRepository;
import ru.itsjava.repository.FilmRepositoryImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@Import(FilmRepositoryImpl.class)
public class FilmRepositoryImplTest {
    public static final long DEFAULT_FILM_ID = 1L;
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private FilmRepository filmRepository;

    @Test
    public void shouldHaveCorrectGetById() {
        var expectedFilm = entityManager.find(Film.class, DEFAULT_FILM_ID);
        var actualFilm = filmRepository.getById(DEFAULT_FILM_ID);

        System.out.println("expectedFilm = " + expectedFilm);
        System.out.println("actualFilm = " + actualFilm);
        assertEquals(expectedFilm, actualFilm);
    }
}
