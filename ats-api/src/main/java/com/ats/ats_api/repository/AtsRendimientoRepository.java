package com.ats.ats_api.repository;

import com.ats.ats_api.model.AtsRendimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtsRendimientoRepository extends JpaRepository<AtsRendimiento, Long> {
}