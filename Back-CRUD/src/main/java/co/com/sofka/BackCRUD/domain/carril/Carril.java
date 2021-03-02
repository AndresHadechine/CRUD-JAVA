package co.com.sofka.BackCRUD.domain.carril;

import co.com.sofka.BackCRUD.domain.carril.values.Posicion;
import co.com.sofka.BackCRUD.domain.carro.Carro;
import co.com.sofka.BackCRUD.domain.juego.Juego;

public class Carril {
    private Carro carro;
    private Juego juego;
    private Posicion posicion;
    private Integer metros;
    private Boolean desplazamientoFinal;

    public Carril(Juego juego, Posicion posicion, Integer metros, Boolean desplazamientoFinal) {
        this.juego = juego;
        this.posicion = posicion;
        this.metros = metros;
        this.desplazamientoFinal = desplazamientoFinal;
    }

    public void agregarCarril(Carro carroNuevo){
        carro = carroNuevo;
    }
    public void alcanzarMeta(){

    }
    void moverCarro(Integer metrosNuevo){
        metros = metros+metrosNuevo;
    }

    public Carro getCarro() {
        return carro;
    }

    public Posicion posicionActual() {
        return posicion;
    }

    public Integer posicionDeseada() {
        return metros;
    }

    public Boolean getDesplazamientoFinal() {
        return desplazamientoFinal;
    }
}
