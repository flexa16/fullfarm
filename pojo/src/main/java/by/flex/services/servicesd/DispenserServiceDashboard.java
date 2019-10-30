package by.flex.services.servicesd;

import by.flex.dto.DispenserDto;
import by.flex.repo.DispenserRepositoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

    public List<DispenserDto> getTenResults(){
        List<DispenserDto> data = new ArrayList<>();
        for (long i = dispenserRepositoryDto.count(); i > dispenserRepositoryDto.count()-10; i--) {
            data.add(dispenserRepositoryDto.findById(i).orElseThrow());
        }
        Collections.reverse(data);
        return data;
    }


}
