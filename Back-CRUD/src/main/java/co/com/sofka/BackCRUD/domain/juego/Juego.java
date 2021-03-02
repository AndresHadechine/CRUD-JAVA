package co.com.sofka.BackCRUD.domain.juego;

import co.com.sofka.BackCRUD.domain.juego.values.Pista;
import co.com.sofka.BackCRUD.domain.juego.values.Podio;

import java.util.Map;

public class Juego {
    private Map<String , Jugador> jugadores;
    private Pista pista;
    private Boolean jugando;
    private Podio podio;

}
