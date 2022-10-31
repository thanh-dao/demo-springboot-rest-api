package com.thanhdao.demospringbootrestapi.controller;


import com.thanhdao.demospringbootrestapi.entity.City;
import com.thanhdao.demospringbootrestapi.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("api/v1/cities/")
public class CityController {
    @Autowired
    CityService cityService;
    @GetMapping("/")
    public List<City> getAllCities() {
        return cityService.getCities();
    }

    @GetMapping("/count")
    public int countCities(){
        return cityService.getCities().size();
    }
}
