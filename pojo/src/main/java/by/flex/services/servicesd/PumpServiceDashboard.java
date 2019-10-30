package by.flex.services.servicesd;

import by.flex.dto.PumpDto;
import by.flex.repo.PumpRepositoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PumpServiceDashboard {
    
    @Autowired
    PumpRepositoryDto pumpRepositoryDto;

    public List< PumpDto > getEntity(int count){
        List<PumpDto> list = new ArrayList<>();

        while (true){
            if(pumpRepositoryDto.count()>count) break;
        }
        long lastEntityOnDb = pumpRepositoryDto.count();
        for (long i = lastEntityOnDb; i > lastEntityOnDb-count; i--) {
            list.add(pumpRepositoryDto.findById(i).orElseThrow());
        }
        return list;
    }
}
