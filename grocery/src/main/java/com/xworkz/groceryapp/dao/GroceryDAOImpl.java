package com.xworkz.groceryapp.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.groceryapp.dto.GroceryDTO;

@Repository
public class GroceryDAOImpl implements GroceryDAO {

	@Autowired
	private SessionFactory factory;

	@Override
	public void save(GroceryDTO groceryDTO) {

		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(groceryDTO);
			session.getTransaction().commit();
		} catch (HibernateException e) {

			e.printStackTrace();
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
