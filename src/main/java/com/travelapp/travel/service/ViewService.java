package com.travelapp.travel.service;

import com.travelapp.travel.model.View;
import com.travelapp.travel.repository.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ViewService {
    @Autowired
    ViewRepository viewRepository;

    public List<View> getViewByCid( List<Integer> cids ){
        List<View> views=new LinkedList<>();
        for (int cid:cids
             ) {
            viewRepository.getAllByCity_Cid(cid).forEach(views::add);
        }
        return views;
    }


}
