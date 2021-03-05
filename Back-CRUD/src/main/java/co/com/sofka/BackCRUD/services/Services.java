package co.com.sofka.BackCRUD.services;

import co.com.sofka.BackCRUD.domain.car.Car;
import co.com.sofka.BackCRUD.domain.car.Driver;
import co.com.sofka.BackCRUD.domain.juego.Game;
import co.com.sofka.BackCRUD.domain.juego.Player;
import co.com.sofka.BackCRUD.domain.juego.values.Track;
import co.com.sofka.BackCRUD.domain.rail.Rail;
import co.com.sofka.BackCRUD.dto.DTOPlayer;
import co.com.sofka.BackCRUD.repository.PlayerRepository;
import co.com.sofka.BackCRUD.repository.PodiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {
    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    PodiumRepository podiumRepository;

    Game game = new Game();
    Track track = new Track();

    public void savePlayer(DTOPlayer dtoplayer){
        Player player = dtoplayer.convertInPlayer();
        player = playerRepository.save(player);
        game.addPlayer(player);
        String color = "";
        String name = "";
        Integer meters = 0;
        Rail rail = new Rail(meters, false);
        Driver driver = new Driver(name);
        Car car = new Car(driver, color);
    }

    public void startGame(){

        do {


        }while (game.getPlaying());





    }
}
