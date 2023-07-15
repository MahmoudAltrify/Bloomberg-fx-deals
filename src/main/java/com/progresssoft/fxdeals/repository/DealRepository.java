package com.progresssoft.fxdeals.repository;

import com.progresssoft.fxdeals.entity.DealEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepository extends JpaRepository<DealEntity, Long> {
}
