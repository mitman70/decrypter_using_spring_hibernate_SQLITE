package com.mahmud.decrypt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahmud.decrypt.model.Crypt;

@Repository
public class CryptDaoImpl implements ICryptDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override

	public List<Crypt> getAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Crypt").list();
		
		
	}

	

}
