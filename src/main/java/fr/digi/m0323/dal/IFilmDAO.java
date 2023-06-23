package fr.digi.m0323.dal;

import fr.digi.m0323.bo.Film;

public interface IFilmDAO {

    void creerUnFilm(Film film);
    void modifierUnFilm(Film film);
}
