package co.com.sofka.BackCRUD.domain.juego.values;

import co.com.sofka.BackCRUD.domain.rail.Rail;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private Integer kilometres;
    private List<Rail> rails;
    private Integer railsNumber;

    public Track() {
        this.rails = new ArrayList<Rail>();
        railsNumber = 0;
    }
    public void addRail(Rail rail){
        rails.add(rail);
    }

    public Integer getKilometres() {
        return kilometres;
    }

    public Integer getrailsNumber() {
        return railsNumber;
    }
}
