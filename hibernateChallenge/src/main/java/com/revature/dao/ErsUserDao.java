package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.ErsUser;
import com.revature.util.HibernateUtil;

public class ErsUserDao {

	@SuppressWarnings("unchecked")
	public List<ErsUser> getAllUsers() {
		Session session = HibernateUtil.getSession();
		return session.createCriteria(ErsUser.class).list();
	}
	
	@SuppressWarnings("unchecked")
	public ErsUser getErsUserByUsername(String username) {
		Session session = HibernateUtil.getSession();
		
		List<ErsUser> users = new ArrayList<>();
		
		users = session.createQuery("from ErsUser where username = :username")
				.setString("username", username).list();
		return users.isEmpty() ? null : users.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<ErsUser> getErsUserByRole(String role) {
		Session session = HibernateUtil.getSession();
		return session.createQuery("select ErsUser from ErsUser eu join eu.role where role = :role")
				.setString("role", role).list();
	}
	
	public int saveUser(ErsUser u) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		int result = (int) session.save(u);
		tx.commit();
		return result;
	}

}
