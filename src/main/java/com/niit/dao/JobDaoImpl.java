package com.niit.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Job;
@Repository
@Transactional
public class JobDaoImpl implements JobDao {
@Autowired
private SessionFactory sessionFactory;
	public void addJob(Job job) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(job);
	}
	

}
