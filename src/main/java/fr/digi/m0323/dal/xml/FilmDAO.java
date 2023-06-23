package fr.digi.m0323.dal.xml;

import fr.digi.m0323.bo.Film;
import fr.digi.m0323.dal.IFilmDAO;

public class FilmDAO implements IFilmDAO {
    @Override
    public void creerUnFilm(Film film) {
        System.out.println("Je créer un film avec du XML");
    }

    @Override
    public void modifierUnFilm(Film film) {
        System.out.println("Je modifie un film avec du XML");
    }
}
