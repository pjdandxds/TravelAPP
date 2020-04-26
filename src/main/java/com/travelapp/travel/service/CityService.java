package com.travelapp.travel.service;

import com.travelapp.travel.model.Result;
import com.travelapp.travel.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public List<Integer> getCityId(String province,String city,String area){
        List<Integer> cids=new LinkedList<>();

        cityRepository.findAll().forEach(city1 ->{
            if(city1.getProvince().equals(province)&&(city1.getCity().equals(city)||city==null)&&(city1.getArea().equals(area)||area==null)){
                cids.add(city1.getCid());
            }
        });

        return cids;
    }
}
