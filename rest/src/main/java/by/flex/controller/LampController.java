package by.flex.controller;

import by.flex.dto.LampDto;
import by.flex.services.LampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LampController {

    @Autowired
    LampService lampService;

    @PostMapping("/addLamp")
    public void createLamp(@RequestBody LampDto lampDto) {
        lampService.createNewLamp(lampDto);
    }

}
