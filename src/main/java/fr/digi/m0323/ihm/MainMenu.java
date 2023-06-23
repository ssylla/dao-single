package fr.digi.m0323.ihm;

import fr.digi.m0323.bo.Film;
import fr.digi.m0323.service.FilmService;

import java.util.Scanner;

public class MainMenu {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        creerUnNouveauFilm();
    }

    private static void creerUnNouveauFilm() {

        //Récupération des infos
        Film film = new Film(); //Création d'un film avec les infos récupérées

        FilmService service = FilmService.getSingleton();
        service.creerUnFilm(film);
    }

    private static void modifierUnFilm() {

        //Récupération des infos
        Film film = new Film(); //Récupération des infos de modifications

        FilmService service = FilmService.getSingleton();
        service.modifierUnFilm(film);
    }
}