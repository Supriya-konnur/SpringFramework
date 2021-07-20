package com.xworkz.soap.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soap.dto.SoapDTO;

@Component
public class SoapDAOImpl implements SoapDAO {

	@Autowired
	
	SessionFactory factory;
	
	@Override
	public void save(SoapDTO sDTO) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(sDTO);
			session.getTransaction().commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			if(session.getTransaction()!=null) {
				session.getTransaction().rollback();
			}
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
	}

	@Override
	public List<SoapDTO> getAllDetails() {
		Session session = null;
		try {
			return factory.openSession().getNamedQuery("getAllDetails").list();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return null;
	}

	@Override
	public SoapDTO getDetailsByName(String name) {

		Session session = null;
		try {
			return (SoapDTO) factory.openSession().getNamedQuery("getDetailsByName").setParameter("na", name).uniqueResult();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		return null;
	}

	@Override
	public void updatePriceByName(String name, Float price) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			Query qry = session.getNamedQuery("updatePriceByName");
			qry.setParameter("nam", name);
			qry.setParameter("pri", price);
			qry.executeUpdate();
			session.getTransaction().commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			if(session.getTransaction()!=null) {
				session.getTransaction().rollback();
			}
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		
	}

	@Override
	public void deleteDetailsByName(String name) {

		Session session = null;
		try {
			
			session = factory.openSession();
			session.beginTransaction();
			session.getNamedQuery("deleteDetailsByName").setParameter("name", name).executeUpdate();
			session.getTransaction().commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			if(session.getTransaction()!=null) {
				session.getTransaction().rollback();
			}
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		
	}

	
}
