package com.capgemini.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.dto.Schedule;

@Repository("scheduledao")
public class ScheduleDaoImple implements ScheduleDAO {
	
	@Autowired
	@PersistenceContext 
	EntityManager entityManager;

	@Override
	public List<Schedule> showDetails() {
		
		List<Schedule> list= new ArrayList<Schedule>();
		Query q =entityManager.createQuery(" from Schedule");
		list = q.getResultList();
		
		return list;
		}

	@Override
	public List<Schedule> showSingle(int id) {
		List<Schedule> list= new ArrayList<Schedule>();
		Query q =entityManager.createQuery(" from Schedule where id=:id");
		q.setParameter("id", id);
		list = q.getResultList();
	
		return list;
		
	
	}
	

}

