package org.example;

import org.hibernate.Session;

public class HibernateDemoMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();

        try {
            UserClassHibernate user = new UserClassHibernate("Alice");
            UserClassHibernate user1 = new UserClassHibernate("Rahul");
            session.beginTransaction();
            session.persist(user); // save(user)
            session.persist(user1); // save(user)
            session.getTransaction().commit();
            System.out.println("User saved: " + user.getId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.close();
        }

    }
}