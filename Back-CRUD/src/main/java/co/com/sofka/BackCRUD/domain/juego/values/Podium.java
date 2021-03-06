package co.com.sofka.BackCRUD.domain.juego.values;

import co.com.sofka.BackCRUD.domain.juego.Player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Podium {
    @Id
    @GeneratedValue
    private Integer ID;
    private String firstPlace;
    private String secondPlace;
    private String thirdPlace;
    private boolean full;

    public Podium() {
        full = false;
    }
    public void assingFirstPlace(String player){
        firstPlace = player;
    }
    public void assingSecondPlace(String player){
        secondPlace = player;
    }
    public void assingThirdPlace(String player){
        thirdPlace = player;
    }
    public boolean isFull(){
        return full;
    }
    public void setFull(boolean full) {
        this.full = full;
    }
    public Integer getID() {
        return ID;
    }
    public String getFirstPlace() {
        return firstPlace;
    }
    public String getSecondPlace() {
        return secondPlace;
    }
    public String getThirdPlace() {
        return thirdPlace;
    }
}
