package co.com.sofka.BackCRUD.domain.rail;

import co.com.sofka.BackCRUD.domain.rail.values.Position;
import co.com.sofka.BackCRUD.domain.car.Car;

public class Rail {
    private Car car;
    private Position position;
    private Integer metros;
    private Boolean desplazamientoFinal;

    public Rail(Integer metros, Boolean desplazamientoFinal) {
        this.metros = metros;
        this.desplazamientoFinal = desplazamientoFinal;
    }

    public void agregarCar(Car carNuevo){
        car = carNuevo;
    }

    void moverCarro(Integer metrosNuevo){
        metros = metros+metrosNuevo;
    }
    public Car getCar() {
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

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setMetros(Integer metros) {
        this.metros = metros;
    }

    public void setDesplazamientoFinal(Boolean desplazamientoFinal) {
        this.desplazamientoFinal = desplazamientoFinal;
    }
}
