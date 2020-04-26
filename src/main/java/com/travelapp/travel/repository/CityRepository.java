package com.travelapp.travel.repository;

import com.travelapp.travel.model.City;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CityRepository extends CrudRepository<City, Integer> {
    Optional<City> getByProvince(String province);
}
