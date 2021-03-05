package co.com.sofka.BackCRUD.controller;

import co.com.sofka.BackCRUD.dto.DTOPlayer;
import co.com.sofka.BackCRUD.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Services service;
    @PostMapping (value = "api/setPlayer")
    public void savePlayer(@RequestBody DTOPlayer dtoPlayer){
        service.savePlayer(dtoPlayer);
    }

}
