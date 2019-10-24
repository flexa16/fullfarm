package by.flex.service;

import by.flex.pojos.dash.HeaterDto;
import by.flex.pojos.rest.devices.Heater;
import by.flex.repositories.dash.HeaterRepositoryDash;
import by.flex.repositories.rest.HeaterRepositoryRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HeaterService {

    @Autowired
    HeaterRepositoryRest heaterRepositoryRest;

    @Autowired
    HeaterRepositoryDash heaterRepositoryDash;

    public void copy() {

        long countRecordOnRestDB = heaterRepositoryRest.count();
        long countRecordOnDashDB = heaterRepositoryDash.count();

        for (long i = countRecordOnDashDB + 1; i < countRecordOnRestDB; i++) {

            Heater heater = heaterRepositoryRest.findById(i).orElseThrow();

            HeaterDto heaterDto = new HeaterDto();

            heaterDto.setId(i);
            heaterDto.setName(heater.getName());
            heaterDto.setPowerUsage(heater.getSensors().getPowerUsage());
            heaterDto.setFunSpeed(heater.getSensors().getFunSpeed());
            heaterDto.setTemperature(heater.getSensors().getTemperature());
            heaterDto.setPosition(heater.getStatus());

            heaterRepositoryDash.save(heaterDto);

            System.out.println("Heater saved! id =" + heaterDto.getId());
        }
    }
}
