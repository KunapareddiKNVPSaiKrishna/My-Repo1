package com.capgemini.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.spring.dto.ScheduledSessions;

import com.capgemini.spring.service.SessionsService;




@Controller
public class SessionsController {

	
	@Autowired
	SessionsService sessionsservice ;
	
	
	
	@RequestMapping(value="/showdetails",method=RequestMethod.GET)
	public ModelAndView getAllDetails() {
		
	 List<ScheduledSessions> list= sessionsservice.showDetails();
	
	return new ModelAndView("display","sessions",list);
}
	
	@RequestMapping(value="/Enrollme/{id}")
	public ModelAndView getSession(@PathVariable("id") int id) {
		
	 List<ScheduledSessions> list1= sessionsservice.showSingle(id);
	
	return new ModelAndView("Sucess","sessions",list1);
}
	
}
