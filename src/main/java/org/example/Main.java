package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cinema");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Halls hall = new Halls(200, "IMAX", 1);

        em.persist(hall);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}