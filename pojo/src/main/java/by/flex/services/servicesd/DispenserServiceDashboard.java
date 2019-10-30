package by.flex.services.servicesd;

import by.flex.dto.DispenserDto;
import by.flex.repo.DispenserRepositoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DispenserServiceDashboard {

    @Autowired
    DispenserRepositoryDto dispenserRepositoryDto;

    public List< DispenserDto > getEntity(int count){
        List<DispenserDto> list = new ArrayList<>();

        while (true){
            System.out.println(dispenserRepositoryDto.count());
        if(dispenserRepositoryDto.count()>count) break;
        }
        long lastEntityOnDb = dispenserRepositoryDto.count();
        for (long i = lastEntityOnDb; i > lastEntityOnDb-count; i--) {
            list.add(dispenserRepositoryDto.findById(i).orElseThrow());
        }
        return list;
    }



}
