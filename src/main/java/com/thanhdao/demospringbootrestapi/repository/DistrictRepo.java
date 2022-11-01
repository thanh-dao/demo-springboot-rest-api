package com.thanhdao.demospringbootrestapi.repository;

import com.thanhdao.demospringbootrestapi.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepo extends JpaRepository<District, String> {
}
