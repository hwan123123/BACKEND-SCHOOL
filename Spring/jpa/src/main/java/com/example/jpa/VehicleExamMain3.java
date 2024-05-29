package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class VehicleExamMain3 {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

//        Car3 car1 = new Car3();
//        car1.setManufacturer("Porsche");
//        car1.setSeatCount(5);
//        em.persist(car1);
//
//        Car3 car2 = new Car3();
//        car2.setManufacturer("BMW");
//        car2.setSeatCount(5);
//        em.persist(car2);
//
//        Truck3 truck1 = new Truck3();
//        truck1.setManufacturer("Volvo");
//        truck1.setPayloadCapacity(20.0);
//        em.persist(truck1);
//
//        Truck3 truck2 = new Truck3();
//        truck2.setManufacturer("Benz");
//        truck2.setPayloadCapacity(15.0);
//        em.persist(truck2);
//
//        Car3 car = em.find(Car3.class, 1L);
//        log.info("Car info : " + car.getManufacturer());

        List<Vehicle3> vehicles = em.createQuery("SELECT v from Vehicle3 v", Vehicle3.class).getResultList();

        for (Vehicle3 vehicle : vehicles) {
            if (vehicle instanceof Car3) {
                Car3 car = (Car3) vehicle;
                log.info("Car info ::: {},{}", car.getManufacturer(), car.getSeatCount());
            } else if (vehicle instanceof Truck3) {
                Truck3 truck = (Truck3) vehicle;
                log.info("Truck info ::: {},{}", truck.getManufacturer(), truck.getPayloadCapacity());
            }
        }

        em.getTransaction().commit();
    }
}
