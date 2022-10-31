package com.thanhdao.demospringbootrestapi.service;

import com.thanhdao.demospringbootrestapi.entity.City;
import com.thanhdao.demospringbootrestapi.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepo cityRepo;

    public List<City> getCities(){
        return  cityRepo.findAll();
    }
}
