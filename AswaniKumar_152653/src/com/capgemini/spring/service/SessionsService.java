package com.capgemini.spring.service;

import java.util.List;

import com.capgemini.spring.dto.ScheduledSessions;





public interface SessionsService {

	
	public  List<ScheduledSessions> showDetails();
	public   List<ScheduledSessions> showSingle(int id);
}
