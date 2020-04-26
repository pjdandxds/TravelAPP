package com.travelapp.travel;

import com.travelapp.travel.model.City;
import com.travelapp.travel.model.Route;
import com.travelapp.travel.model.User;
import com.travelapp.travel.model.View;
import com.travelapp.travel.repository.CityRepository;
import com.travelapp.travel.repository.RouteRepository;
import com.travelapp.travel.repository.UserRepository;
import com.travelapp.travel.repository.ViewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TravelApplication {

    //运行SpringBoot
    public static void main(String[] args) {
        SpringApplication.run(TravelApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRe, CityRepository cityRe, ViewRepository viewRe, RouteRepository routeRe){
        return args ->{
            City city=new City("1","2","3");
            City city2=new City("1","4","5");
            City city1=new City("3","2","1");
            View view=new View(city,"1",1.0,1.0,"1",10,1.0,1.0,"1","1","1","1","1");
            User user=new User("admin","1234");
            Route route=new Route();
            route.setUser(user);
            route.setView1(view);
            route.setState(0);
            userRe.save(user);
            userRe.save(new User("admin2","123456"));
            cityRe.save(city);
            cityRe.save(city1);
            viewRe.save(view);
            viewRe.save(new View(city1,"2",2.0,2.0,"2",20,2.0,2.0,"2","2","2","1","1"));
            viewRe.save(new View(city,"3",3.0,3.0,"3",30,3.0,3.0,"3","3","3","3","3"));
            cityRe.save(city2);
            routeRe.save(route);
        };
    }


}
