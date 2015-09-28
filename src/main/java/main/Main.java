package main;


import entity.Family;

import factory.SessionFactoryManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import repo.FamilyRepo;

public class Main {


    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryManager.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();



        Family family = new Family("Oleg","Bodnar", "me");

        session.save(family);
        System.out.println("Inserted Successfully");
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();



    }
}
