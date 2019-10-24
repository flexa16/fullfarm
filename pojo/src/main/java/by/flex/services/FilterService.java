package by.flex.services;

import by.flex.dto.FilterDto;
import by.flex.pojoss.devices.Filter;
import by.flex.pojoss.sensors.FilterSensors;
import by.flex.repo.FilterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilterService {

    @Autowired
    FilterRepository filterRepository;

    public void createNewFilter(FilterDto filterDto) {
        Filter filter = new Filter();
        filter.setSensors(new FilterSensors(filterDto.getCapacity(), filterDto.getFilterHealth(), filterDto.getPowerUsage()));
        filter.setName(filterDto.getName());
        filter.setId(filterRepository.count() + 1);

        filterRepository.save(filter);
    }

}
