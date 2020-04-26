package com.travelapp.travel.repository;

import com.travelapp.travel.model.Route;
import org.springframework.data.repository.CrudRepository;

public interface RouteRepository extends CrudRepository<Route,Integer> {
    Iterable<Route> getAllByUser_Uid(int uid);
}
