package by.flex.mongo_service;

import by.flex.pojos.dash.DispenserDto;
import by.flex.pojos.rest.devices.Dispenser;
import by.flex.repositories.dash.DispenserRepositoryDash;
import by.flex.repositories.rest.DispenserRepositoryRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DispenserService {

    @Autowired
    DispenserRepositoryRest dispenserRepositoryRest;

    @Autowired
    DispenserRepositoryDash dispenserRepositoryDash;

    public void copy() {
        long countRecordOnRestDB = dispenserRepositoryRest.count();
        long countRecordOnDashDB = dispenserRepositoryDash.count();

        for (long i = countRecordOnDashDB + 1; i < countRecordOnRestDB; i++) {

            Dispenser dispenser = dispenserRepositoryRest.findById(i).orElseThrow();

            DispenserDto dispenserDto = new DispenserDto();

            dispenserDto.setId(i);
            dispenserDto.setName(dispenser.getName());
            dispenserDto.setPowerUsage(dispenser.getSensors().getPowerUsage());
            dispenserDto.setToValves(dispenser.getSensors().getToValves());
            dispenserDto.setValvesCount(dispenser.getValvesCount());
            dispenserDto.setWaterUsage(dispenser.getSensors().getWaterUsage());

            dispenserRepositoryDash.save(dispenserDto);

            System.out.println("Dispenser saved! id =" + dispenserDto.getId());
        }
    }
}
