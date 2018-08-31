package com.team6.service.login;

import com.team6.dao.UserDao;
import com.team6.dto.login.UserInfo;
import com.team6.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.alibaba.druid.util.Utils.md5;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
                        "classpath:spring/spring-service.xml"})

public class LoginServiceTest {
    @Autowired
    private UserDao userDao;
    @Autowired
    private LoginService loginService;
    @Test
    public void login() {
        String name = "郑伟坑";
        String password = "12345";
        System.out.println("token:"+loginService.Login(name,password));
    }

    @Test
    public void verifyLogin() {

    }

    @Test
    public void regiest(){
        String name="郭晓锋";
        String password="guoxiaofeng";
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setRole(123L);
        System.out.println("regiest:"+loginService.regiest(user));
    }

    @Test
    public void updatePassword(){
        String name="郭晓锋";
        String prePassword="guoxiaofeng";
        String newPassword="123456";
        System.out.println(loginService.updatePassword(name,prePassword,newPassword));
    }

}