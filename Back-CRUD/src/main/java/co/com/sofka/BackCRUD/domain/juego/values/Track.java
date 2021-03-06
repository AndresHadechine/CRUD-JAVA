package co.com.sofka.BackCRUD.domain.juego.values;

import co.com.sofka.BackCRUD.domain.rail.Rail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Track {

    private Integer kilometres;
    private Map<Integer,Rail> rails;
    private Integer railsNumber;

    public Track() {
        this.rails = new HashMap<>();
        this.railsNumber = 0;
        this.kilometres = 3;

    }
    public void addRail(Integer id,Rail rail){
        rails.put(id,rail);
    }

    public Map<Integer, Rail> getRails() {
        return rails;
    }

    public Integer getRailsNumber() {
        return railsNumber;
    }

    public Integer getKilometres() {
        return kilometres;
    }

    public Integer getrailsNumber() {
        return railsNumber;
    }
}
