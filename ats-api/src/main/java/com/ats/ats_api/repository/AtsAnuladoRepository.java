package com.ats.ats_api.repository;

import com.ats.ats_api.model.AtsAnulado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtsAnuladoRepository extends JpaRepository<AtsAnulado, Long> {
}