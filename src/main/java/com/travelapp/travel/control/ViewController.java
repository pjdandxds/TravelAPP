package com.travelapp.travel.control;

import com.travelapp.travel.model.View;
import com.travelapp.travel.service.CityService;
import com.travelapp.travel.service.ViewService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/view")
public class ViewController {
    @Autowired
    ViewService viewService;
    @Autowired
    CityService cityService;

    @ApiOperation(value="城市id",response= List.class)
    @ResponseBody
    @GetMapping("/getViewByCid")
    public List<View> getViewByCid(
            @RequestParam("province") String province,
            @RequestParam(value = "city",required = false) String city,
            @RequestParam(value = "area",required = false) String area
    ){
        return viewService.getViewByCid(cityService.getCityId(province,city,area));
    }

}
