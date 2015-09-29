package main;


import entity.Family;

import factory.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import repo.FamilyRepo;
//import repo.FamilyRepo;

public class Main {


    public static void main(String[] args) {


        FamilyRepo.setFactory(HibernateUtil.getSessionFactory());

        //        Add new employee
        Family family = new Family(2, "Roksolana", "Bodnar", "wife");
        FamilyRepo.addFamily(family);


    }
}

