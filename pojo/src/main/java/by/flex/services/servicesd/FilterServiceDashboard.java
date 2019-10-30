package by.flex.services.servicesd;

import by.flex.dto.FilterDto;
import by.flex.repo.FilterRepositoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class FilterServiceDashboard {

    @Autowired
    FilterRepositoryDto filterRepositoryDto;

    public List< FilterDto > getEntity(int count){
        List<FilterDto> list = new ArrayList<>();
        while (true){
            if(filterRepositoryDto.count()>count) break;
        }
        long lastEntityOnDb = filterRepositoryDto.count();
        for (long i = lastEntityOnDb; i > lastEntityOnDb-count; i--) {
            list.add(filterRepositoryDto.findById(i).orElseThrow());
        }
        return list;
    }

    public List<FilterDto> getTenResults(){
        List<FilterDto> data = new ArrayList<>();
        for (long i = filterRepositoryDto.count(); i > filterRepositoryDto.count()-10; i--) {
            data.add(filterRepositoryDto.findById(i).orElseThrow());
        }
        Collections.reverse(data);
        return data;
    }
}
