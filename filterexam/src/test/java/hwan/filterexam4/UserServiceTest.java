package hwan.filterexam4;

import hwan.filterexam4.entity.User;
import hwan.filterexam4.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    @Transactional
    void registerNewUser() {
        User user = new User();
        user.setName("hwan");
        user.setUsername("hwan");
        user.setPassword("1234");
        user.setEmail("hwan@exam.com");

        User user1 = userService.registerNewUser(user);

        assertNotNull(user1.getId());
    }
}
