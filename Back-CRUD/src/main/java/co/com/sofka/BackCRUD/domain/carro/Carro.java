package co.com.sofka.BackCRUD.domain.carro;

import co.com.sofka.BackCRUD.domain.carril.Carril;
import co.com.sofka.BackCRUD.domain.juego.Juego;

public class Carro {

   private Conductor conductor;
   private Integer distancia;
   private String color;
   private Juego juego;

   public Carro(Conductor conductor) {
      this.conductor = conductor;
   }

   void AsignarConductor(Conductor conductorNuevo){
      conductor = conductorNuevo;
   }
   Conductor getConductor(){
      return conductor;
   }
   void avanzarCarril(Carril carril){

   }
   Integer getDistancia(){
      return distancia;
   }
   String getColor(){
      return color;
   }
}
