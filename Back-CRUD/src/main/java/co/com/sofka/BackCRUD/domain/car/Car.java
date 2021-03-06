package co.com.sofka.BackCRUD.domain.car;

public class Car {

   private Driver driver;
   private Integer distance;
   private String color;

   public Car(Driver driver, String color) {
      this.driver = driver;
      this.distance = 0;
      this.color = color;
   }
   public void assingDriver(Driver driverNew){
      driver = driverNew;
   }
   public Driver getConductor(){
      return driver;
   }
   public void avanzarCarril(){
      distance = distance+driver.lanzarDado();
   }
   public Integer getDistance(){
      return distance;
   }
   public String getColor(){
      return color;
   }
}
