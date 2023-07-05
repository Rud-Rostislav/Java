package com.rrs.homework_40.controllers;

import com.rrs.homework_40.domain.City;
import com.rrs.homework_40.domain.Country;
import com.rrs.homework_40.repository.CityRepository;
import com.rrs.homework_40.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final CountryRepository countryRepository;
    private final CityRepository cityRepository;

    @GetMapping("/city")
    public String city() {
        return cityRepository.findAll().toString();
    }

    @GetMapping("/country")
    public String county() {
        return countryRepository.findAll().toString();
    }

    @PostMapping("/city")
    public City createCity(@RequestBody City city) {
        if (city.getCountry() != null) {
            Country country = countryRepository.findById(city.getCountry().getId()).orElse(null);
            if (country != null) {
                city.setCountry(country);
                country.getCities().add(city);
                countryRepository.save(country);
                cityRepository.save(city);
            }
        }
        return cityRepository.save(city);
    }

    @PostMapping("/country")
    public Country createCountry(@RequestBody Country country) {
        if (!country.getCities().isEmpty()) {
            List<City> cities = country.getCities();
            country.setCities(new ArrayList<>());
            countryRepository.save(country);
            for (City city : cities) {
                city.setCountry(country);
                country.getCities().add(city);
                cityRepository.save(city);
            }
        }
        return countryRepository.save(country);
    }

    @PutMapping("/city")
    public City updateCity(@RequestBody City city) {
        return cityRepository.save(city);
    }

    @PutMapping("/country")
    public Country updateCountry(@RequestBody Country country) {
        return countryRepository.save(country);
    }

    @DeleteMapping("/city")
    public void deleteCity(@RequestBody City city) {
        cityRepository.delete(city);
    }

    @DeleteMapping("/country")
    public void deleteCountry(@RequestBody Country country) {
        countryRepository.delete(country);
    }
}