package com.xworkz.ice_cream.dto;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ice_cream.dao.IceCreamDAO;
@Component
public class IceCreamDAOImpl implements IceCreamDAO{

	@Autowired
	SessionFactory factory;
	@Override
	public void save(IceCreamDTO creamDTO) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(creamDTO);
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
	public List<IceCreamDTO> getAllDetails() {
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
	public IceCreamDTO getDetailsByName(String name) {
		Session session = null;
		try {
			return (IceCreamDTO) factory.openSession().getNamedQuery("getDetailsByName").setParameter("nm", name).uniqueResult();
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
	public void updatePriceByName(String name, double price) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			Query qry = session.getNamedQuery("updatePriceByName");
			qry.setParameter("nm", name);
			qry.setParameter("pr", price);
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
			session.getNamedQuery("deleteDetailsByName").setParameter("nm", name).executeUpdate();
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
