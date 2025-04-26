package com.verdea_api.verdea.repositories;

import com.verdea_api.verdea.entities.IrrigationHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IrrigationHistoryRepository extends JpaRepository<IrrigationHistory, Long> {}
