package ru.itsjava.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itsjava.domain.Film;
import ru.itsjava.repository.FilmRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FilmServiceImpl implements FilmService {
    private final FilmRepository filmRepository;

    @Transactional(readOnly = true)
    @Override
    public void printAllFilms() {
        System.out.println("Наши фильмы: ");
        List<Film> allFilms = filmRepository.findAll();
        System.out.println("allFilms.toString() = " + allFilms.toString());
    }

    @Transactional(readOnly = true)
    @Override
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }
}
