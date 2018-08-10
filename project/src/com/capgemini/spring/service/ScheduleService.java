package com.capgemini.spring.service;

import java.util.List;

import com.capgemini.spring.dto.Schedule;

public interface ScheduleService {
	public List<Schedule> showDetails();
    public List<Schedule> showSingle(int id);
}
