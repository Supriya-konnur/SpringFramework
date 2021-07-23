package com.xworkz.videogame.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.videogame.dto.VideoGameDTO;
@Component
public class VideoGameDAOImpl implements VideoGameDAO{

	@Autowired
	 SessionFactory factory;

	
	@Override
	public void save(VideoGameDTO gameDTO) {
		
		
			Session session= null;
			
			try {
				session = factory.openSession();
				session.beginTransaction();
				session.save(gameDTO);
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
