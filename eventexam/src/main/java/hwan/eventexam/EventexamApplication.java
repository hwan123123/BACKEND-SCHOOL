package hwan.eventexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventexamApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(EventexamApplication.class, args);
    }

    @Autowired
    private CustomEventPublisher customEventPublisher;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");
        customEventPublisher.publishEvent("hello~~");
    }
}
