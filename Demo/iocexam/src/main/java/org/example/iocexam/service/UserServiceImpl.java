package org.example.iocexam.service;

import org.example.iocexam.dao.UserDao;
import org.example.iocexam.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    private UserDao userDao;



    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void joinUser(User user) {
        // 회원가입을 위한 비즈니스 코드가 작성되어야 함
        if (user.getName() == null || user.getName().isEmpty() ||
            user.getEmail() == null || user.getEmail().isEmpty() ||
            user.getPassword() == null || user.getPassword().isEmpty()) {
            System.out.println("사용자 정보가 올바르지 않습니다.");
        } else {
            // 회원가입을 위한 비즈니스가 수행되면 해당 데이터를 저장하는 코드가 실행
            userDao.addUser(user);
        }
    }
}
