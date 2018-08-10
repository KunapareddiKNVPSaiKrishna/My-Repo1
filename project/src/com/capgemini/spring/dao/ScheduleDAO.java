package com.capgemini.spring.dao;

import java.util.List;

import com.capgemini.spring.dto.Schedule;

public interface ScheduleDAO {
	public List<Schedule> showDetails();
	public List<Schedule> showSingle(int id);

}
