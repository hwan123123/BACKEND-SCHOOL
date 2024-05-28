package com.example.jpa;

import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthorExamMain {
    public static void find() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            Author author = em.find(Author.class, 1L);
            log.info("Author name : {}", author.getName());

            for (Book book : author.getBooks()) {
                log.info("Book Name : {}", book.getTitle());
            }
        } finally {
            em.close();
        }
    }

    public static void create() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {

        } finally {
            em.close();
        }
    }

    public static void update() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {

        } finally {
            em.close();
        }
    }

    public static void delete() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {

        } finally {
            em.close();
        }
    }

    public static void main(String[] args) {

    }
}
