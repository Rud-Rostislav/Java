package com.rrs.homework_40.repository;

import com.rrs.homework_40.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}