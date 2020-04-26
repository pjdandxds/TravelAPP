package com.travelapp.travel.control;


import com.travelapp.travel.model.Result;
import com.travelapp.travel.model.User;
import com.travelapp.travel.model.UserExm;
import com.travelapp.travel.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "登录请求-测试用", response = List.class)
    @ResponseBody
    @GetMapping("/login")
    public boolean loginRequest(@RequestParam("username") String username,
                               @RequestParam("password") String password) {
        return userService.login(username,password);
    }

    //较新的登录版本
    @ApiOperation(value = "登录请求", response = List.class)
    @ResponseBody
    @GetMapping("/login2")
    public Result<Integer> loginRequest2(@RequestParam("username") String username,
                                        @RequestParam("password") String password) {
        return userService.login2(username,password);
    }

    @ApiOperation(value = "注册请求", response = List.class)
    @ResponseBody
    @PostMapping("/regist")
    public Result regist(@RequestParam("username") String username,
                         @RequestParam("password") String password ){
        return userService.regist(username,password);
    }

    @ApiOperation(value = "显示用户数据", response = List.class)
    @ResponseBody
    @PostMapping("/show")
    public User showUser(@RequestParam("uid") int uid){
        return userService.showUser(uid);
    }

    @ApiOperation(value = "修改用户数据", response = List.class)
    @ResponseBody
    @PostMapping("/update")
    public boolean updateUser(@RequestBody UserExm user){

        return userService.updateUser(user);
    }
}
