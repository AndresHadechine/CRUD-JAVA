package co.com.sofka.BackCRUD.domain.juego;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue
    protected Integer ID;
    protected String name;
    protected String color;
    protected Integer points;

    public String getName() {
        return name;
    }
    public String getColor(){
        return color;
    }
    void assingPoints(Integer newPoints){
        points = newPoints;
    }
}
