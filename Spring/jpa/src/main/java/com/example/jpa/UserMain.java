package com.example.jpa;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class UserMain {
    //    private static final Logger log = LoggerFactory.getLogger(UserMain.class);
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        // findUser()
//        log.info("==========findUser()==========");
//        User finduser = userDAO.findUser(1L);
//        log.info("Found user : {}", finduser.getName());
//
//        User findUser2 = userDAO.findUser(1L);
//
//        if (finduser == findUser2) {
//            log.info("findUser == findUser2");
//        } else {
//            log.info("findUser != findUser2");
//        }

        User user = new User();
        user.setId(2L);
//        user.setName("hwan");
//        user.setEmail("hwan@gmail.com");

        userDAO.deleteUser(user);
//        userDAO.updateUser(user);
//
//        User hwanUser = new User("minji","minji@exam.com");
//
//        userDAO.createUser(hwanUser);
//
//        log.info("Create user : " + hwanUser.getName());
//        log.info("user email : {}", hwanUser.getEmail());
    }
}
