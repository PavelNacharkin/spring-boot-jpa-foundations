package ru.itsjava.repository;

import ru.itsjava.domain.Film;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
@RequiredArgsConstructor
public class FilmRepositoryImpl implements FilmRepository {
    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public List<Film> findAll() {
        return entityManager
                .createQuery("select distinct f from films f join fetch f.genre join fetch f.places", Film.class)
                .getResultList();
    }

    @Override
    public Film getById(long id) {
        return entityManager.find(Film.class, id);
    }

}
