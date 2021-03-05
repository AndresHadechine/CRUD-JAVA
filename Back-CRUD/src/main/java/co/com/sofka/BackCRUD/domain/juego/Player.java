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
    public Integer getPoints(){
        return points;
    }
    public Integer getID(){
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPoints(Integer points) {
        this.points = points;
    }

    void assingPoints(Integer newPoints){
        points = newPoints;
    }
}
