package by.flex.service;

import by.flex.pojos.dash.LampDto;
import by.flex.pojos.rest.devices.Lamp;
import by.flex.repositories.dash.LampRepositoryDash;
import by.flex.repositories.rest.LampRepositoryRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LampService {

    @Autowired
    LampRepositoryRest lampRepositoryRest;

    @Autowired
    LampRepositoryDash lampRepositoryDash;

    public void copy() {

        long countRecordOnRestDB = lampRepositoryRest.count();
        long countRecordOnDashDB = lampRepositoryDash.count();

        for (long i = countRecordOnDashDB + 1; i < countRecordOnRestDB; i++) {

            Lamp lamp = lampRepositoryRest.findById(i).orElseThrow();

            LampDto lampDto = new LampDto();

            lampDto.setId(i);
            lampDto.setName(lamp.getName());
            lampDto.setPowerUsage(lamp.getSensors().getPowerUsage());
            lampDto.setBrightness(lamp.getSensors().getBrightness());

            lampRepositoryDash.save(lampDto);

            System.out.println("Lamp saved! id =" + lampDto.getId());
        }
    }
}
