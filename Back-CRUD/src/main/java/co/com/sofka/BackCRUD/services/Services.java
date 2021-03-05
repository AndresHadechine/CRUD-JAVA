package co.com.sofka.BackCRUD.services;

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

    public void savePlayer(DTOPlayer dtoplayer){
        playerRepository.save(dtoplayer.convertInPlayer());
    }
    public void startGame(){


    }
}
