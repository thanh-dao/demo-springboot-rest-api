package com.thanhdao.demospringbootrestapi.service;

import com.thanhdao.demospringbootrestapi.entity.District;
import com.thanhdao.demospringbootrestapi.repository.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DistrictService {
    @Autowired
    private DistrictRepo districtRepo;

    public List<District> getAll(){
        return districtRepo.findAll();
    }
}
