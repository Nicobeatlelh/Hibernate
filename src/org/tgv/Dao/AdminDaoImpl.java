package org.tgv.Dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.tgv.pojo.Admin;


@Transactional
@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void save(Admin admin) {
		getSession().save(admin);
	}

	@Override
	public List<Admin> buscarTodos() {
		List<Admin> admins = null;
		 Query query = (Query) getSession().createQuery("from Admin");
		    admins = query.list();
		    return admins;    
	}

	@Override
	public Admin buscarXId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> buscarXNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(int idAd) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
