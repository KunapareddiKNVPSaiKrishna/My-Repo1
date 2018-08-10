package com.capgemini.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.spring.dto.Schedule;

import com.capgemini.spring.service.ScheduleService;

@Controller
public class ScheduleController {
	
@Autowired
ScheduleService scheduleservice;



@RequestMapping(value="/showdetails",method=RequestMethod.GET)
public ModelAndView getAllDetails() {
	
 List<Schedule> list= scheduleservice.showDetails();

return new ModelAndView("display","Schedules",list);
}

@RequestMapping(value="/Enrollme/{id}")
public ModelAndView getSession(@PathVariable("id") int id) {
	
 List<Schedule> list1= scheduleservice.showSingle(id);

return new ModelAndView("sucess","Schedules",list1);
}
}
