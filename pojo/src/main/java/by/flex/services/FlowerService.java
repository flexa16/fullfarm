package by.flex.services;

import by.flex.dto.FlowerDto;
import by.flex.pojoss.devices.Flower;
import by.flex.pojoss.sensors.FlowerSensors;
import by.flex.repo.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FlowerService {

    @Autowired
    FlowerRepository flowerRepository;

    public void createNewFlower(FlowerDto flowerDto) {
        Flower flower = new Flower();
        flower.setSensors(new FlowerSensors(flowerDto.getLuxometer(),
                flowerDto.getThermometer(),
                flowerDto.getMoistureMeter(),
                flowerDto.getMineralsMeter()));
        flower.setPosition(flowerDto.getPosition());
        flower.setName(flowerDto.getName());
        flower.setId(flowerRepository.count() + 1);
        flowerRepository.save(flower);
    }

}
