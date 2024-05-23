package org.example.iocexam.config;

import org.example.iocexam.controller.UserController;
import org.example.iocexam.dao.UserDao;
import org.example.iocexam.dao.UserDaoImpl;
import org.example.iocexam.service.UserService;
import org.example.iocexam.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan(basePackages = "org.example.iocexam")
public class UserConfig {

    // IOC 컨테이너에 Bean을 등록하는 방법을 생각해보고 동작될 수 있도록 작성해주세요.
    // 1. javaConfig 를 이용해서 동작되도록 코드를 완성해보세요.
//    @Bean
//    public UserController userController(UserService userService) {
//        return new UserController(userService);
//    }
//
//    @Bean
//    public UserService userService(UserDao userDao) {
//        return new UserServiceImpl(userDao);
//    }
//
//    @Bean
//    public UserDao userDao() {
//        return new UserDaoImpl();
//    }

    // 2. componentScan 을 이용해서 동작되도록 코드를 완성해보세요.
}
