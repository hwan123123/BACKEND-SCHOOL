package org.example.springjdbc08;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJDBC08Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringJDBC08Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserDao userDao) {
        return args -> {
            User user = new User();
            user.setName("haha");
            user.setEmail("haha@exam.com");

            User resultUser = userDao.insertUser(user);

            System.out.println(user.getId());
        };
    }
}
