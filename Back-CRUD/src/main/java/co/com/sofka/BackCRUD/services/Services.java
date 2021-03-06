package co.com.sofka.BackCRUD.services;

import co.com.sofka.BackCRUD.domain.car.Car;
import co.com.sofka.BackCRUD.domain.car.Driver;
import co.com.sofka.BackCRUD.domain.juego.Game;
import co.com.sofka.BackCRUD.domain.juego.Player;
import co.com.sofka.BackCRUD.domain.juego.values.Podium;
import co.com.sofka.BackCRUD.domain.juego.values.Track;
import co.com.sofka.BackCRUD.domain.rail.Rail;
import co.com.sofka.BackCRUD.dto.DTOPlayer;
import co.com.sofka.BackCRUD.repository.PlayerRepository;
import co.com.sofka.BackCRUD.repository.PodiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Services {
    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    PodiumRepository podiumRepository;

    Track track = new Track();
    Game game = new Game(track);
    Podium podium = new Podium();
    List<String> place  = new ArrayList<>();

    public DTOPlayer savePlayer(DTOPlayer dtoplayer){
        Player player = dtoplayer.convertInPlayer();
        player = playerRepository.save(player);
        game.addPlayer(player);
        Integer meters = 0;
        Rail rail = new Rail(meters, false);
        Driver driver = new Driver(player.getName());
        Car car = new Car(driver, player.getColor());
        dtoplayer.convertInDTO(player);
        rail.agregarCar(car);
        game.getTrack().addRail(player.getID(),rail);
        return dtoplayer;
    }

    public Podium startGame(){
        podium = new Podium();
        do {
            game.setPlaying(false);
            game.getTrack().getRails().forEach((k,v)->{
                if(!v.getDesplazamientoFinal()){
                    v.getCar().avanzarCarril();
                    System.out.println(v.getCar().getConductor().getName());
                    System.out.println(v.getCar().getDistance());
                    if (v.getCar().getDistance()>=game.getTrack().getKilometres()*1000){
                        v.setDesplazamientoFinal(true);
                        place.add(v.getCar().getConductor().getName());
                    }
                    game.setPlaying(true);
                }
            });
        }while (game.getPlaying());
        podium.assingFirstPlace(place.get(0));
        podium.assingSecondPlace(place.get(1));
        podium.assingThirdPlace(place.get(2));
        podium.setFull(true);
        podiumRepository.save(podium);
        track = new Track();
        game = new Game(track);
        System.out.println(podium.getFirstPlace());
        System.out.println(podium.getSecondPlace());
        System.out.println(podium.getThirdPlace());

        return podium;
    }

    public void resetGame(){
        game.getTrack().getRails().forEach((k,v)->{
           v.setDesplazamientoFinal(false);
           v.getCar().setDistance(0);
        });

    }
}
