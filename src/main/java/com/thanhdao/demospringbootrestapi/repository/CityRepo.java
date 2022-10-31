package com.thanhdao.demospringbootrestapi.repository;

import com.thanhdao.demospringbootrestapi.entity.City;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface CityRepo extends JpaRepository<City,String>{
}
