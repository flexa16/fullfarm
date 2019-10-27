package by.flex.mongo_service;

import by.flex.pojos.dash.PumpDto;
import by.flex.pojos.rest.devices.Pump;
import by.flex.repositories.dash.PumpRepositoryDash;
import by.flex.repositories.rest.PumpRepositoryRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PumpService {

    @Autowired
    PumpRepositoryRest pumpRepositoryRest;

    @Autowired
    PumpRepositoryDash pumpRepositoryDash;

    public void copy() {

        long countRecordOnRestDB = pumpRepositoryRest.count();
        long countRecordOnDashDB = pumpRepositoryDash.count();

        for (long i = countRecordOnDashDB + 1; i < countRecordOnRestDB; i++) {

            Pump pump = pumpRepositoryRest.findById(i).orElseThrow();

            PumpDto pumpDto = new PumpDto();

            pumpDto.setId(i);
            pumpDto.setName(pump.getName());
            pumpDto.setPosition(pump.getPosition());
            pumpDto.setPowerStatus(pump.getSensors().isPowerStatus());
            pumpDto.setPowerUsage(pump.getSensors().getPowerUsage());
            pumpDto.setWaterUsage(pump.getSensors().getWaterUsage());

            pumpRepositoryDash.save(pumpDto);

            System.out.println("Pump saved! id =" + pumpDto.getId());
        }
    }
}
