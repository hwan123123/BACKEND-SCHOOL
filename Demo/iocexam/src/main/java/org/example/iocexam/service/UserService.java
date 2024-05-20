package org.example.iocexam.service;

import org.example.iocexam.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    public void joinUser(User user);
}
