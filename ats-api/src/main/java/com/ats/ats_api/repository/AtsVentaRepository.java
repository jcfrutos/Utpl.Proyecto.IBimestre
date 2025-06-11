package com.ats.ats_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ats.ats_api.dtos.AtsVentaDto;

@Repository
public interface AtsVentaRepository extends JpaRepository<AtsVentaDto, Long> {
}