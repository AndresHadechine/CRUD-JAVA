package co.com.sofka.BackCRUD.domain.juego;

import co.com.sofka.BackCRUD.domain.juego.values.Track;
import co.com.sofka.BackCRUD.domain.juego.values.Podium;

import java.util.Map;

public class Game {
    private Map<String , Player> players;
    private Track track;
    private Boolean playing;
    private Podium podium;

}
