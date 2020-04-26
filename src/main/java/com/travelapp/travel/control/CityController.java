package com.travelapp.travel.control;

import com.travelapp.travel.model.Result;
import com.travelapp.travel.service.CityService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    CityService cityService;


    //
    @ApiOperation(value="城市id",response= List.class)
    @ResponseBody
    @GetMapping("/getCid")
    public List<Integer> getCityId(
            @RequestParam("province") String province,
            @RequestParam(value = "city",required = false) String city,
            @RequestParam(value = "area",required = false) String area
    ){
        return cityService.getCityId(province,city,area);
    }
}
