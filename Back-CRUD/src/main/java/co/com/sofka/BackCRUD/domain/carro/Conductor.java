package co.com.sofka.BackCRUD.domain.carro;

import co.com.sofka.BackCRUD.domain.juego.Jugador;

public class Conductor extends Jugador {


    public Conductor(String nombre, String color) {
        super(nombre, color);
    }
    public Integer lanzarDado(){

        Integer valor;
        valor = (int)((Math.random()*6+1)*100);
        return valor;
    }

}
