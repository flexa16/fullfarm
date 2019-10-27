package by.flex.mongo_service;

import by.flex.pojos.dash.FlowerDto;
import by.flex.pojos.rest.devices.Flower;
import by.flex.repositories.dash.FlowerRepositoryDash;
import by.flex.repositories.rest.FlowerRepositoryRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlowerService {

    @Autowired
    FlowerRepositoryRest flowerRepositoryRest;

    @Autowired
    FlowerRepositoryDash flowerRepositoryDash;

    public void copy() {

        long countRecordOnRestDB = flowerRepositoryRest.count();
        long countRecordOnDashDB = flowerRepositoryDash.count();

        for (long i = countRecordOnDashDB + 1; i < countRecordOnRestDB; i++) {

            Flower flower = flowerRepositoryRest.findById(i).orElseThrow();

            FlowerDto flowerDto = new FlowerDto();

            flowerDto.setId(i);
            flowerDto.setName(flower.getName());
            flowerDto.setPosition(flower.getPosition());
            flowerDto.setLuxometer(flower.getSensors().getLuxometer());
            flowerDto.setMoistureMeter(flower.getSensors().getMoistureMeter());
            flowerDto.setThermometer(flower.getSensors().getThermometer());
            flowerDto.setMineralsMeter(flower.getSensors().getMineralsMeter());

            flowerRepositoryDash.save(flowerDto);

            System.out.println("Flower saved! id =" + flowerDto.getId());
        }
    }
}
