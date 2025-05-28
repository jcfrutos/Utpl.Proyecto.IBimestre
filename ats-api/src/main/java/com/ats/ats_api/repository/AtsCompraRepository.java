package com.ats.ats_api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ats.ats_api.model.AtsCompra;

@Repository
public interface AtsCompraRepository extends JpaRepository<AtsCompra, Long> {
}