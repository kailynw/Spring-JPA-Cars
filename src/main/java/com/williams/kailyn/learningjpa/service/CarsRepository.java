package com.williams.kailyn.learningjpa.service;

import com.williams.kailyn.learningjpa.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Cars,Long> {
}
