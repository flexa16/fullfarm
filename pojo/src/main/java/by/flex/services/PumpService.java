package by.flex.services;

import by.flex.dto.PumpDto;
import by.flex.pojoss.devices.Pump;
import by.flex.pojoss.sensors.PumpSensors;
import by.flex.repo.PumpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PumpService {

    @Autowired
    PumpRepository pumpRepository;

    public void createNewPump(PumpDto pumpDto) {
        Pump pump = new Pump();
        pump.setSensors(new PumpSensors(pumpDto.isPowerStatus(),
                pumpDto.getWaterUsage(),
                pumpDto.getPowerUsage()));
        pump.setPosition(pumpDto.getPosition());
        pump.setName(pumpDto.getName());
        pump.setId(pumpRepository.count() + 1);

        pumpRepository.save(pump);
    }

}
