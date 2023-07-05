package com.rrs.homework_40.repository;

import com.rrs.homework_40.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}