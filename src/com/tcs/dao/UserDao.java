package com.tcs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tcs.beans.UserDetails;
import com.tcs.util.HibernateUtil;

public class UserDao {

	Session session;
	Transaction transaction;
	SessionFactory sessionfactory;
	
	public UserDao() {
		/*
		if (sessionfactory == null)
		  sessionfactory = new Configuration().configure().buildSessionFactory();
		
		  session=sessionfactory.openSession();
		  */
		}
	
	public void saveOrUpdateUser(UserDetails user) {
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.saveOrUpdate(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			//transaction.rollback();
			e.printStackTrace();
		}
	}

	
	public void deleteUser(long userId) {
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			UserDetails user = (UserDetails) session.get(UserDetails.class, userId);
			session.delete(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			//transaction.rollback();
			e.printStackTrace();
		} 
	}
	
	
	public List<UserDetails> listUser() {
		List<UserDetails> courses = null;
		try {
		     session = HibernateUtil.getSessionFactory().getCurrentSession();
		     session.beginTransaction();
			courses = session.createQuery("from UserDetails").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return courses;
	}

	
	public UserDetails listUserById(long userId) {
		UserDetails user = null;
		try {
		     session = HibernateUtil.getSessionFactory().getCurrentSession();
		     session.beginTransaction();
			user = (UserDetails) session.get(UserDetails.class, userId);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}