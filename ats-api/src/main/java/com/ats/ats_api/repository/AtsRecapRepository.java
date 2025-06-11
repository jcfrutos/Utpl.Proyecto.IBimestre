package com.ats.ats_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ats.ats_api.dtos.AtsRecapDto;

@Repository
public interface AtsRecapRepository extends JpaRepository<AtsRecapDto, Long> {
}