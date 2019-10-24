package by.flex.controller;

import by.flex.dto.HeaterDto;
import by.flex.services.HeaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaterController {

    @Autowired
    HeaterService heaterService;

    @PostMapping("/addHeater")
    public void createHeater(@RequestBody HeaterDto heaterDto) {
        heaterService.createNewHeater(heaterDto);
    }

}
