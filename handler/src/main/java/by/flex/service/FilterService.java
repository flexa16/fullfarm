package by.flex.service;

import by.flex.pojos.dash.FilterDto;
import by.flex.pojos.rest.devices.Filter;
import by.flex.repositories.dash.FilterRepositoryDash;
import by.flex.repositories.rest.FilterRepositoryRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FilterService {

    @Autowired
    FilterRepositoryRest filterRepositoryRest;

    @Autowired
    FilterRepositoryDash filterRepositoryDash;

    public void copy() {

        long countRecordOnRestDB = filterRepositoryRest.count();
        long countRecordOnDashDB = filterRepositoryDash.count();

        for (long i = countRecordOnDashDB + 1; i < countRecordOnRestDB; i++) {

            Filter filter = filterRepositoryRest.findById(i).orElseThrow();

            FilterDto filterDto = new FilterDto();

            filterDto.setId(i);
            filterDto.setName(filter.getName());
            filterDto.setPowerUsage(filter.getSensors().getPowerUsage());
            filterDto.setCapacity(filter.getSensors().getCapacity());
            filterDto.setFilterHealth(filter.getSensors().getFilterHealth());


            filterRepositoryDash.save(filterDto);

            System.out.println("Filter saved! id =" + filterDto.getId());
        }
    }
}
