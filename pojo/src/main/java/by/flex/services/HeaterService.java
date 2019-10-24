package by.flex.services;

import by.flex.dto.HeaterDto;
import by.flex.pojoss.devices.Heater;
import by.flex.pojoss.sensors.HeaterSensors;
import by.flex.repo.HeaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaterService {

    @Autowired
    HeaterRepository heaterRepository;

    public void createNewHeater(HeaterDto heaterDto) {
        Heater heater = new Heater();
        heater.setSensors(new HeaterSensors(heaterDto.getPowerUsage(),
                heaterDto.getFunSpeed(),
                heaterDto.getTemperature()));
        heater.setStatus(heaterDto.getPosition());
        heater.setName(heaterDto.getName());
        heater.setId(heaterRepository.count() + 1);

        heaterRepository.save(heater);
    }

}
