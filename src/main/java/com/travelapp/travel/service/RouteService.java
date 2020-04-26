package com.travelapp.travel.service;

import com.travelapp.travel.model.Route;
import com.travelapp.travel.model.RouteExm;
import com.travelapp.travel.repository.RouteRepository;
import com.travelapp.travel.repository.UserRepository;
import com.travelapp.travel.repository.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class RouteService {
    @Autowired
    RouteRepository routeRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ViewRepository viewRepository;

    public boolean saveRoute(RouteExm route){
        Route newRoute=new Route();
        newRoute.setState(0);
        saveAroute(route, newRoute);
        routeRepository.save(newRoute);
        return true;
    }

    private void saveAroute(RouteExm route, Route newRoute) {
        newRoute.setUser(userRepository.findById(route.getUid()).get());
        newRoute.setView1(viewRepository.findById(route.getSid1()).get());
        newRoute.setView2(viewRepository.findById(route.getSid2()).get());
        newRoute.setView13(viewRepository.findById(route.getSid3()).get());
        newRoute.setView14(viewRepository.findById(route.getSid4()).get());
        newRoute.setView15(viewRepository.findById(route.getSid5()).get());
    }

    public List<Route> showRoute(int uid) {
        List<Route> routes=new LinkedList<>();
        routeRepository.getAllByUser_Uid(uid).forEach(routes::add);
        return routes;
    }

    public boolean updateRoute(RouteExm route) {
        Route newRoute=routeRepository.findById(route.getRid()).get();
        newRoute.setState(route.getState());
        saveAroute(route, newRoute);
        return true;
    }
}
