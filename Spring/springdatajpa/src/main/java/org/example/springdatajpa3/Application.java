package org.example.springdatajpa3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return (args) -> {
// 네이티브 SQL을 사용한 사용자 조회 예제
            List<User> usersByEmail = userRepository.findByEmailNative("example");
            usersByEmail.forEach(user -> log.info("이메일로 찾은 사용자: " + user.getEmail()));
// 네이티브 쿼리를 사용하여 일부 칼럼을 조회하고 DTO로 반환하는 예제
            List<Object[]> usersByName = userRepository.findUsersByNameNative("홍");
            List<UserDTO> userDtos = usersByName.stream()
                    .map(result -> new UserDTO((String) result[0], (String) result[1]))
                    .collect(Collectors.toList());
            userDtos.forEach(userDto -> log.info("이름으로 찾은 사용자: " + userDto.getName() + ", 이메일: " + userDto.getEmail()));
        };
    }
}
