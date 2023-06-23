package fr.digi.m0323.service;

import fr.digi.m0323.bo.Film;
import fr.digi.m0323.dal.DAOFactory;
import fr.digi.m0323.dal.IFilmDAO;

public class FilmService {

    private static FilmService singleton;

    private FilmService() {}

    public static FilmService getSingleton() {
        if (null == singleton) {
            singleton = new FilmService();
        }
        return singleton;
    }

    public void creerUnFilm(Film film) {

        IFilmDAO dao = DAOFactory.getFilmDAO();
        dao.creerUnFilm(film);
    }
    public void modifierUnFilm(Film film) {

        System.out.println("Ici on modifie un film !");
    }
}
