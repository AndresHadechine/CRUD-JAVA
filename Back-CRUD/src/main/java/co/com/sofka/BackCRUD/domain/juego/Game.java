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

    public Game(Track track) {
        this.players = new HashMap<>();
        this.playing = false;
        this.track = track;
    }

    public void addPlayer(Player player){
       String ID = String.valueOf(player.getID());
        players.put(ID,player);
    }

    public Track getTrack() {
        return track;
    }

    public void setPlayers(Map<String, Player> players) {
        this.players = players;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public void setPlaying(Boolean playing) {
        this.playing = playing;
    }

    public void setPodium(Podium podium) {
        this.podium = podium;
    }

    public Boolean getPlaying() {
        return playing;
    }
}
