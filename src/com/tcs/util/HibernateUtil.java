package com.tcs.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class HibernateUtil {
 
    private static final SessionFactory sessionFactory = buildSessionFactory();
 
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            System.out.println("Initial SessionFactory creation failed." + ex);
            return null;
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
