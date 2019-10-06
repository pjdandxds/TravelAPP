package com.travelapp.travel;

import com.travelapp.travel.model.User;
import com.travelapp.travel.repository.UserRepository;
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
    public CommandLineRunner demo(UserRepository userRe){
        return args ->{
            userRe.save(new User("admin","1234"));
            userRe.save(new User("admin2","123456"));
        };
    }


}
