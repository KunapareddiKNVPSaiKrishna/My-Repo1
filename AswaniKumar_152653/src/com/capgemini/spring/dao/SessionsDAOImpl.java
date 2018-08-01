package com.capgemini.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.dto.ScheduledSessions;




@Repository("sessionsdao")
public class SessionsDAOImpl implements SessionsDAO {

	@Autowired
	@PersistenceContext 
	EntityManager entityManager;
	

	@Override
	public List<ScheduledSessions> showDetails() {
	
		List<ScheduledSessions> list= new ArrayList<ScheduledSessions>();
		Query q =entityManager.createQuery(" from ScheduledSessions");
		list = q.getResultList();
		
		return list;
		
	}


	@Override
	public List<ScheduledSessions> showSingle(int id) {
		List<ScheduledSessions> list= new ArrayList<ScheduledSessions>();
		Query q =entityManager.createQuery(" from ScheduledSessions where id:=id");
		q.setParameter("id", id);
		list = q.getResultList();
	
		return list;
		
		
	}

}
