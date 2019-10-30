package by.flex.services.servicesd;

import by.flex.dto.LampDto;
import by.flex.repo.LampRepositoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LampServiceDashboard {
    
    @Autowired
    LampRepositoryDto lampRepositoryDto;

    public List< LampDto > getEntity(int count){
        List<LampDto> list = new ArrayList<>();

        while (true){
            if(lampRepositoryDto.count()>count) break;
        }
        long lastEntityOnDb = lampRepositoryDto.count();
        for (long i = lastEntityOnDb; i > lastEntityOnDb-count; i--) {
            list.add(lampRepositoryDto.findById(i).orElseThrow());
        }
        return list;
    }
}
