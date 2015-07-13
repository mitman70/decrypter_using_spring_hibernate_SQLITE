package com.mahmud.decrypt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahmud.decrypt.model.Body;

@Repository
public class BodyDaoImpl implements IBodyDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override

	public List<Body> getAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Body").list();
		
		
	}

	

}
