package fr.digi.m0323.dal;


import java.util.ResourceBundle;

public final class DAOFactory {


    private static final String MODE_JPA = "JPA";
    private static final String MODE_JDBC = "JDBC";
    private static final String MODE_XML = "XML";

    private static final String MODE_COURANT;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("app");
        MODE_COURANT = bundle.getString("mode.stockage");
    }

    private DAOFactory() {}

    public static IFilmDAO getFilmDAO() {

        IFilmDAO dao = null;
        switch (MODE_COURANT) {
            case MODE_JPA -> dao = new fr.digi.m0323.dal.jpa.FilmDAO();
            case MODE_JDBC -> dao = new fr.digi.m0323.dal.jdbc.FilmDAO();
            case MODE_XML -> dao = new fr.digi.m0323.dal.xml.FilmDAO();
            default -> throw new RuntimeException("Mode non implémenté !!!");
        }
        return dao;
    }

}
