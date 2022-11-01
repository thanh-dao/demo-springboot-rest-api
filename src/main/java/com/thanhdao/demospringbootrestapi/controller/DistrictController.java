package com.thanhdao.demospringbootrestapi.controller;


import com.thanhdao.demospringbootrestapi.entity.District;
import com.thanhdao.demospringbootrestapi.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/v1/districts")
public class DistrictController {
    @Autowired
    private DistrictService districtService;
    @GetMapping("/")
    public List<District> getAll(){
        return districtService.getAll();
    }
}
