package by.flex.controller;

import by.flex.dto.FilterDto;
import by.flex.services.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {

    @Autowired
    FilterService filterService;

    @PostMapping("/addFilter")
    public void createFilter(@RequestBody FilterDto filterDto) {
        filterService.createNewFilter(filterDto);
    }

}
