package co.com.sofka.BackCRUD.domain.juego;

import co.com.sofka.BackCRUD.domain.juego.values.Track;
import co.com.sofka.BackCRUD.domain.juego.values.Podium;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private Map<String , Player> players;
    private Track track;
    private Boolean playing;
    private Podium podium;

    public Game() {
        this.players = new HashMap<>();
    }

    public void addPlayer(Player player){
       String ID = String.valueOf(player.getID());
        players.put(ID,player);
    }

    public Boolean getPlaying() {
        return playing;
    }
}
