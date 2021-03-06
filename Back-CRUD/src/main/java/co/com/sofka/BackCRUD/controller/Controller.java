package co.com.sofka.BackCRUD.controller;

import co.com.sofka.BackCRUD.domain.juego.values.Podium;
import co.com.sofka.BackCRUD.dto.DTOPlayer;
import co.com.sofka.BackCRUD.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Controller {
    @Autowired
    Services service;
    @PostMapping (value = "api/setPlayer")
    public DTOPlayer savePlayer(@RequestBody DTOPlayer dtoPlayer){
        return service.savePlayer(dtoPlayer);
    }
    @GetMapping(value = "api/savePodium")
    public Podium savePodium(){
        return service.startGame();
    }

}
