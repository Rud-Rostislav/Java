package com.rrs.homework_40;

import com.rrs.homework_40.domain.City;
import com.rrs.homework_40.domain.Country;
import com.rrs.homework_40.repository.CityRepository;
import com.rrs.homework_40.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Run {
    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }

    @Bean
    public CommandLineRunner initializeData(CityRepository cityRepository, CountryRepository countryRepository) {
        return args -> {
            City city1 = new City(null, "Київ", 2000000, true, null);
            City city2 = new City(null, "Одеса", 1000000, false, null);

            List<City> cities = new ArrayList<>();
            cities.add(city1);
            cities.add(city2);

            Country country = new Country(null, "Україна", 5000000, cities);

            city1.setCountry(country);
            city2.setCountry(country);

            countryRepository.save(country);
            cityRepository.save(city1);
            cityRepository.save(city2);
        };
    }
}
