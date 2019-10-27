package by.flex;

import by.flex.mongo_service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class HandlerApp implements CommandLineRunner {

    @Autowired
    DispenserService dispenserService;
    @Autowired
    FilterService filterService;
    @Autowired
    FlowerService flowerService;
    @Autowired
    HeaterService heaterService;
    @Autowired
    LampService lampService;
    @Autowired
    PumpService pumpService;


    public static void main(String[] args) {
        SpringApplication.run(HandlerApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        while (true) {
            dispenserService.copy();
            filterService.copy();
            flowerService.copy();
            heaterService.copy();
            lampService.copy();
            pumpService.copy();
        }
    }
}

