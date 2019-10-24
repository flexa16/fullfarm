package by.flex.controller;

import by.flex.dto.FlowerDto;
import by.flex.services.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowerController {

    @Autowired
    FlowerService flowerService;

    @PostMapping("/addFlower")
    public void createFlower(@RequestBody FlowerDto flowerDto) {
        flowerService.createNewFlower(flowerDto);
    }

}
