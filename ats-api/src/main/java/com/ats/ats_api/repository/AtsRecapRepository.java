package com.ats.ats_api.repository;

import com.ats.ats_api.model.AtsRecap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtsRecapRepository extends JpaRepository<AtsRecap, Long> {
}