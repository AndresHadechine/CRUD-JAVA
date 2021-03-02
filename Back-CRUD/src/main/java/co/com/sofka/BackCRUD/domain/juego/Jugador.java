package co.com.sofka.BackCRUD.domain.juego;

public class Jugador {
    public String nombre;
    public String color;
    public Integer puntos;

    public Jugador(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }
    public String getColor(){
        return color;
    }
    void asignarPuntos(Integer puntosNuevos){
        puntos = puntosNuevos;
    }
}
