package com.skillnext1;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = new Employee("Lucky", 25000);
        session.save(emp);

        tx.commit();
        session.close();

        System.out.println("Employee saved successfully");
    }
}
