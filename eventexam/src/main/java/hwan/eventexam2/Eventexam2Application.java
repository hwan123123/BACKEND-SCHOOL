package hwan.eventexam2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Eventexam2Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Eventexam2Application.class, args);
    }

    @Autowired
    private CustomEventPublisher customEventPublisher;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");
        System.out.println("Eventexam2Application Thread Name :: " + Thread.currentThread().getName());
        customEventPublisher.publishEvent("hello~~");
    }
}
