package co.com.sofka.BackCRUD.domain.car;

import co.com.sofka.BackCRUD.domain.rail.Rail;
import co.com.sofka.BackCRUD.domain.juego.Game;

public class Car {

   private Driver driver;
   private Integer distance;
   private String color;

   public Car(Driver driver, String color) {
      this.driver = driver;
      this.distance = 0;
      this.color = color;
   }
   void AssingDriver(Driver driverNew){
      driver = driverNew;
   }
   Driver getConductor(){
      return driver;
   }
   void avanzarCarril(Integer points){
      distance = distance+points;
   }
   Integer getDistance(){
      return distance;
   }
   String getColor(){
      return color;
   }
}
