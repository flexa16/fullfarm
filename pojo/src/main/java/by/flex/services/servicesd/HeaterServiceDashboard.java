package by.flex.services.servicesd;

import by.flex.dto.HeaterDto;
import by.flex.repo.HeaterRepositoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeaterServiceDashboard {
    
    @Autowired
    HeaterRepositoryDto heaterRepositoryDto;

    public List< HeaterDto > getEntity(int count){
        List<HeaterDto> list = new ArrayList<>();

        while (true){
            if(heaterRepositoryDto.count()>count) break;
        }
        long lastEntityOnDb = heaterRepositoryDto.count();
        for (long i = lastEntityOnDb; i > lastEntityOnDb-count; i--) {
            list.add(heaterRepositoryDto.findById(i).orElseThrow());
        }
        return list;
    }
}
