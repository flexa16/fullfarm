package by.flex.services;

import by.flex.dto.DispenserDto;
import by.flex.pojoss.devices.Dispenser;
import by.flex.pojoss.sensors.DispenserSensors;
import by.flex.repo.DispenserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DispenserService {

    @Autowired
    DispenserRepository dispenserRepository;

    public void createNewDispenser(DispenserDto dispenserDto) {
        Dispenser dispenser = new Dispenser();
        dispenser.setSensors(new DispenserSensors(dispenserDto.getPowerUsage(),
                dispenserDto.getWaterUsage(),
                dispenserDto.getToValves()));
        dispenser.setValvesCount(dispenserDto.getValvesCount());
        dispenser.setName(dispenserDto.getName());
        dispenser.setId(dispenserRepository.count() + 1);

        dispenserRepository.save(dispenser);
    }
}
