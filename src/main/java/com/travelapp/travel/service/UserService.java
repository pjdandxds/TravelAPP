package com.travelapp.travel.service;

import com.travelapp.travel.model.Result;
import com.travelapp.travel.model.User;
import com.travelapp.travel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    //测试用
    public boolean login(String username,String password){
        Iterable<User> users=userRepository.findAll();
        for(User u:
                users){
            if(u.getUsername().equals(username)&&u.getPassword().equals(password))
                return true;
        }
        return false;
    }

    public Result<Integer> login2(String username,String password){
        Result<Integer> result=new Result<>();
        User u= userRepository.getByUsername(username).get();
        if(u.getPassword().equals(password)){
            result.setSuccess(true);
            result.setMsg("登录成功");
            result.setData(u.getUid());
        }else {
            result.setSuccess(false);
            result.setMsg("错误密码");
        }
        return result;
    }

    public Result<String> regist(String username,String password){
        Result<String> result=new Result<>();

        if(userRepository.getByUsername(username).isPresent()){
            result.setMsg("注册失败");
            result.setSuccess(false);
        }else{
            userRepository.save(new User(username,password));
            result.setMsg("成功注册");
            result.setSuccess(true);
            result.setData("成功注册");
        }
        return result;
    }
}
