package com.travelapp.travel.repository;

import com.travelapp.travel.model.View;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ViewRepository extends CrudRepository<View,Integer> {
    Iterable<View> getAllByCity_Cid(int cid);
}