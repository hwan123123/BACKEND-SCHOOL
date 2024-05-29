package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class VehicleExamMain2 {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();

//        Car2 car1 = new Car2();
//        car1.setManufacturer("Porsche");
//        car1.setSeatCount(5);
//        em.persist(car1);
//
//        Car2 car2 = new Car2();
//        car2.setManufacturer("BMW");
//        car2.setSeatCount(5);
//        em.persist(car2);
//
//        Truck2 truck1 = new Truck2();
//        truck1.setManufacturer("Volvo");
//        truck1.setPayloadCapacity(20.0);
//        em.persist(truck1);
//
//        Truck2 truck2 = new Truck2();
//        truck2.setManufacturer("Benz");
//        truck2.setPayloadCapacity(15.0);
//        em.persist(truck2);

//        Car2 car = em.find(Car2.class, 1L);
//        log.info("Car info : " + car.getManufacturer());

        List<Vehicle2> vehicles = em.createQuery("SELECT v from Vehicle2 v", Vehicle2.class).getResultList();

        for (Vehicle2 vehicle : vehicles) {
            if (vehicle instanceof Car2) {
                Car2 car = (Car2) vehicle;
                log.info("Car info ::: {},{}", car.getManufacturer(), car.getSeatCount());
            } else if (vehicle instanceof Truck2) {
                Truck2 truck = (Truck2) vehicle;
                log.info("Truck info ::: {},{}", truck.getManufacturer(), truck.getPayloadCapacity());
            }
        }

        em.getTransaction().commit();
    }
}
