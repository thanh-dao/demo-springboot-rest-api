package com.thanhdao.demospringbootrestapi.repository;

import com.thanhdao.demospringbootrestapi.entity.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WardRepo extends JpaRepository<Ward, String> {
}
