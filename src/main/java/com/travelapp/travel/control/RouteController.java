package com.travelapp.travel.control;

import com.travelapp.travel.model.Route;
import com.travelapp.travel.model.RouteExm;
import com.travelapp.travel.service.RouteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/route")
public class RouteController {
    @Autowired
    RouteService routeService;

    @ApiOperation(value="储存线路",response= List.class)
    @ResponseBody
    @PostMapping("/saveRoute")
    public boolean saveRoute(@RequestBody RouteExm route
    ){
        return routeService.saveRoute(route);
    }

    @ApiOperation(value="储存线路",response= List.class)
    @ResponseBody
    @PostMapping("/updateRoute")
    public boolean updateRoute(@RequestBody RouteExm route
    ){
        return routeService.updateRoute(route);
    }

    @ApiOperation(value="展示线路",response= List.class)
    @ResponseBody
    @GetMapping("/showRoute")
    public List<Route> showRoute(@RequestParam("uid") int uid
    ){
        return routeService.showRoute(uid);
    }



}
