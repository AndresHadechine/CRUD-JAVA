package co.com.sofka.BackCRUD.dto;

import co.com.sofka.BackCRUD.domain.juego.Player;

public class DTOPlayer extends Player {

    public Player convertInPlayer(){
        Player player = new Player();
        player.setName(name);
        player.setID(ID);
        player.setColor(color);
        player.setPoints(points);
        return player;
    }

    public void convertInDTO(Player player){
        name = player.getName();
        ID = player.getID();
        color = player.getColor();
        points = player.getPoints();
    }

}
