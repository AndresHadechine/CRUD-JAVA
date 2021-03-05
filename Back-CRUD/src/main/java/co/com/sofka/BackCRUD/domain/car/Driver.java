package co.com.sofka.BackCRUD.domain.car;

import co.com.sofka.BackCRUD.domain.juego.Player;

public class Driver extends Player {


    public Driver(String name) {
        this.name = name;
    }
    public Integer lanzarDado(){
        Integer value;
        value = (int)((Math.random()*6+1)*100);
        return value;
    }

}
