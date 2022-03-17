package com.hoang;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

            System.out.println("2");
            Session session = sessionFactory.openSession();

            System.out.println("3");
            Customer customer = new Customer();
            customer.setId(5);
            customer.setName("Ariana Grande");

            System.out.println("4");
            Transaction t = session.beginTransaction();

            System.out.println("5");
            session.save(customer);

            System.out.println("6");
            t.commit();

            System.out.println("7");
            session.close();
            sessionFactory.close();

            System.out.println("success");
        } catch (HibernateException hiberEx) {
            hiberEx.printStackTrace();
        }
    }
}
