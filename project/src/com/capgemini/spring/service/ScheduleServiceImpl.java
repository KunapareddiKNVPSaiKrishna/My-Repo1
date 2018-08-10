package com.capgemini.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.spring.dao.ScheduleDAO;
import com.capgemini.spring.dto.Schedule;
@Repository("sheduleservice")
@Transactional
public class ScheduleServiceImpl implements ScheduleService{
	@Autowired
	ScheduleDAO scheduledao;
	@Override
	
	public List<Schedule> showDetails() {
		
		return scheduledao.showDetails();
	}
	@Override
	public List<Schedule> showSingle(int id) {
	
		return scheduledao.showSingle(id);
	}

}
