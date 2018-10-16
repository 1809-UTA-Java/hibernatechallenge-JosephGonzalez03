package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.revature.model.Reimbursement;
import com.revature.util.HibernateUtil;

public class ReimbursementDao {
	@SuppressWarnings("unchecked")
	public List<Reimbursement> getReimbursementsByStatus(String status) {
		Session session = HibernateUtil.getSession();
		return session.createCriteria(Reimbursement.class)
				.add(Restrictions.eq("ReimbursementStatus.status", status))
				.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Reimbursement> getReimbursementsByUsernameAndStatus(String username, String status) {
		Session session = HibernateUtil.getSession();
		return session.createCriteria(Reimbursement.class)
				.add(Restrictions.eq("username", username))
				.add(Restrictions.eq("ReimbursementStatus.status", status))
				.list();
	}
	
	public int saveReimbursement(Reimbursement r) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		int result = (int) session.save(r);
		tx.commit();
		return result;
	}
}
