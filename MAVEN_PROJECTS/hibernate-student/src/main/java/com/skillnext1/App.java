package com.skillnext1;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = new Student("Lucky", "CSE", 55000);
        session.save(student);

        tx.commit();
        session.close();

        System.out.println("Student saved successfully");
    }
}
