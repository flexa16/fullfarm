package by.flex.controller;

import by.flex.dto.PumpDto;
import by.flex.services.PumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PumpController {

    @Autowired
    PumpService pumpService;

    @PostMapping("/addPump")
    public void createPump(@RequestBody PumpDto pumpDto) {
        pumpService.createNewPump(pumpDto);
    }

}
