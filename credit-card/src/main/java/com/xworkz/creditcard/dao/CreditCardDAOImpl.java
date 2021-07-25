package com.xworkz.creditcard.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.creditcard.dto.CreditCardDTO;

@Component
public class CreditCardDAOImpl implements CreditCardDAO{

	@Autowired
	SessionFactory factory;
	
	
	@Override
	public void save(CreditCardDTO cardDTO) {
		Session session = null;
		try {
			session=factory.openSession();
			session.beginTransaction();
			session.save(cardDTO);
			session.getTransaction().commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			if(session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
			else {
				if(session!=null) {
					session.close();
				}
			}
		}
		
	}

	@Override
	public CreditCardDTO getDetailsByName(String name) {

		Session session = null;
		try {
			return (CreditCardDTO) factory.openSession().getNamedQuery("getDetailsByName").setParameter("nm", name).uniqueResult();
		}catch (HibernateException e) {
			e.printStackTrace();
			
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return null;
	}

	@Override
	public List<CreditCardDTO> getAllDetails() {
		try {
			return factory.openSession().getNamedQuery("getAllDetails").list();
		}catch (HibernateException e) {
			e.printStackTrace();
			
		}finally {
			if(factory.openSession()!=null) {
				factory.openSession().close();
			}
		}
		return null;
	}

}
