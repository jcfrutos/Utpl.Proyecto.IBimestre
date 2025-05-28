package com.ats.ats_api.repository;

import com.ats.ats_api.model.AtsVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtsVentaRepository extends JpaRepository<AtsVenta, Long> {
}