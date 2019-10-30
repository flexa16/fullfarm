package by.flex.services.servicesd;

import by.flex.dto.FlowerDto;
import by.flex.repo.FlowerRepositoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class FlowerServiceDashboard {
    
    @Autowired
    FlowerRepositoryDto flowerRepositoryDto;

    public List< FlowerDto > getEntity(int count){
        List<FlowerDto> list = new ArrayList<>();

        while (true){
            if(flowerRepositoryDto.count()>count) break;
        }
        long lastEntityOnDb = flowerRepositoryDto.count();
        for (long i = lastEntityOnDb; i > lastEntityOnDb-count; i--) {
            list.add(flowerRepositoryDto.findById(i).orElseThrow());
        }
        return list;
    }

    public List<FlowerDto> getTenResults(){
        List<FlowerDto> data = new ArrayList<>();
        for (long i = flowerRepositoryDto.count(); i > flowerRepositoryDto.count()-10; i--) {
            data.add(flowerRepositoryDto.findById(i).orElseThrow());
        }
        Collections.reverse(data);
        return data;
    }
    
}
