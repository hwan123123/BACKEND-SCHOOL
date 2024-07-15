package hwan.redisexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class RedisApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

    @Autowired
    PersonService personService;

    @Autowired
    RedisService redisService;

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setId("kim");
        person.setName("kim jeonghwan");
        person.setAge(22);

//        personService.savePerson(person);
//
//        Optional<Person> kim = personService.getPersonById("kim");
//        System.out.println(kim.get().getName());
//
//        Iterable<Person> allPersons = personService.getAllPersons();
//        allPersons.forEach(System.out::println);

        // RedisService 이용
        String key = "hwankey";
        String value = "{\"name\":\"hwan\",\"age\":22}";    // {"name":"hwan","age":22}

        redisService.saveJsonWithTTL(key, value, 20);

        String retrievedValue = redisService.getJson(key);
        System.out.println("Retrieved JSON : " + retrievedValue);

        Thread.sleep(21000);
        retrievedValue = redisService.getJson(key);
        System.out.println("Retrieved JSON : " + retrievedValue);
    }
}
