package by.flex.services;

import by.flex.dto.LampDto;
import by.flex.pojoss.devices.Lamp;
import by.flex.pojoss.sensors.LampSensors;
import by.flex.repo.LampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LampService {

    @Autowired
    LampRepository lampRepository;

    public void createNewLamp(LampDto lampDto) {
        Lamp lamp = new Lamp();
        lamp.setSensors(new LampSensors(lampDto.getPowerUsage(),
                lampDto.getBrightness()));
        lamp.setName(lampDto.getName());
        lamp.setId(lampRepository.count() + 1);

        lampRepository.save(lamp);
    }

}
