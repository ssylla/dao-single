package fr.digi.m0323.dal.jdbc;

import fr.digi.m0323.bo.Film;
import fr.digi.m0323.dal.IFilmDAO;

public class FilmDAO implements IFilmDAO {
    @Override
    public void creerUnFilm(Film film) {
        System.out.println("Je créer un film avec JDBC");
    }

    @Override
    public void modifierUnFilm(Film film) {
        System.out.println("Je modifie un film avec JDBC");
    }
}
