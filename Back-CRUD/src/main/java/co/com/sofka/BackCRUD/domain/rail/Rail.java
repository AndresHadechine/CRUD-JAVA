package co.com.sofka.BackCRUD.domain.rail;

import co.com.sofka.BackCRUD.domain.rail.values.Position;
import co.com.sofka.BackCRUD.domain.car.Car;
import co.com.sofka.BackCRUD.domain.juego.Game;

public class Rail {
    private Car car;
    private Game game;
    private Position position;
    private Integer metros;
    private Boolean desplazamientoFinal;

    public Rail(Game game, Position position, Integer metros, Boolean desplazamientoFinal) {
        this.game = game;
        this.position = position;
        this.metros = metros;
        this.desplazamientoFinal = desplazamientoFinal;
    }

    public void agregarCarril(Car carNuevo){
        car = carNuevo;
    }
    public void alcanzarMeta(){

    }
    void moverCarro(Integer metrosNuevo){
        metros = metros+metrosNuevo;
    }

    public Car getCarro() {
        return car;
    }

    public Position posicionActual() {
        return position;
    }

    public Integer posicionDeseada() {
        return metros;
    }

    public Boolean getDesplazamientoFinal() {
        return desplazamientoFinal;
    }
}
