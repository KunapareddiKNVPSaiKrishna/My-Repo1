package com.capgemini.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.dao.SessionsDAO;
import com.capgemini.spring.dto.ScheduledSessions;


@Repository("sessionsservice")
public class SessionsServiceImpl implements SessionsService{

	@Autowired
	SessionsDAO sessionsdao;
	
	
	@Override
	public List<ScheduledSessions> showDetails() {
		
	
		return sessionsdao.showDetails();
	}


	@Override
	public List<ScheduledSessions> showSingle(int id) {
		
		return sessionsdao.showSingle(id);
	}

}
