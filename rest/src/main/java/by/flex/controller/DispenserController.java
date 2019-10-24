package by.flex.controller;

import by.flex.dto.DispenserDto;
import by.flex.services.DispenserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DispenserController {

    @Autowired
    DispenserService dispenserService;

    @PostMapping("/addDispenser")
    public void createDispenser(@RequestBody DispenserDto dispenserDto) {
        dispenserService.createNewDispenser(dispenserDto);
    }

}
