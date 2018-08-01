package com.capgemini.spring.dao;

import java.util.List;

import com.capgemini.spring.dto.ScheduledSessions;





public interface SessionsDAO {

	
	public   List<ScheduledSessions> showDetails();
	public   List<ScheduledSessions> showSingle(int id);
}
