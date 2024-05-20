package org.example.springjdbc04;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class SpringJDBC04Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringJDBC04Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(JdbcTemplate jdbcTemplate) {
        return args -> {
// RowMapper example
            String sql = "SELECT id, name, email FROM users";
            List<User> users = jdbcTemplate.query(sql, new UserRowMapper());
            users.forEach(user -> System.out.println(user));
        };
    }
    private static class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            Long id = rs.getLong("id");
            String name = rs.getString("name");
            String email = rs.getString("email");
            return new User(id, name, email);
        }
    }
}
