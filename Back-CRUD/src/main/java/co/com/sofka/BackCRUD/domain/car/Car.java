package co.com.sofka.BackCRUD.domain.car;

import co.com.sofka.BackCRUD.domain.rail.Rail;
import co.com.sofka.BackCRUD.domain.juego.Game;

public class Car {

   private Driver driver;
   private Integer distance;
   private String color;
   private Game game;

   public Car(Driver driver) {
      this.driver = driver;
   }
   void AssingDriver(Driver driverNew){
      driver = driverNew;
   }
   Driver getConductor(){
      return driver;
   }
   void avanzarCarril(Rail rail){
   }
   Integer getDistance(){
      return distance;
   }
   String getColor(){
      return color;
   }
}
