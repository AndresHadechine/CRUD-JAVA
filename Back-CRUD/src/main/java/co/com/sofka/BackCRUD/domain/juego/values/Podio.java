package co.com.sofka.BackCRUD.domain.juego.values;

import co.com.sofka.BackCRUD.domain.juego.Jugador;

public class Podio {
    private Jugador primerLugar;
    private Jugador segundoLugar;
    private Jugador tercerLugar;
    private boolean lleno;

    public Podio() {
        lleno = false;
    }
    public void asignarPrimerLugar(Jugador jugador){
        primerLugar = jugador;
    }
    public void asignarSegundoLugar(Jugador jugador){
        segundoLugar = jugador;
    }
    public void asignarTercerLugar(Jugador jugador){
        tercerLugar = jugador;
    }
    public boolean estaLleno(){
        return lleno;
    }
}
