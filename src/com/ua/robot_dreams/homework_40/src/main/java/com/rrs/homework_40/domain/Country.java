package com.rrs.homework_40.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float population;

    @OneToMany(mappedBy = "country")
    private List<City> cities;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country{id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", population=").append(population);
        sb.append(", cities=[");
        if (cities != null && !cities.isEmpty()) {
            for (int i = 0; i < cities.size(); i++) {
                City city = cities.get(i);
                sb.append(city.getName());
                if (i < cities.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}