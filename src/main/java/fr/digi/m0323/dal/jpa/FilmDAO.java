package fr.digi.m0323.dal.jpa;

import fr.digi.m0323.bo.Film;
import fr.digi.m0323.dal.IFilmDAO;

public class FilmDAO implements IFilmDAO {
    @Override
    public void creerUnFilm(Film film) {
        System.out.println("Je créer un film avec JPA");
    }

    @Override
    public void modifierUnFilm(Film film) {
        System.out.println("Je modifie un film avec JPA");
    }
}
