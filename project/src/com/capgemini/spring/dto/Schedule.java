package com.capgemini.spring.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Schedule {
	@Id
	private int id ;
	private String sessionsName;
	private int duration;
	private String faculty;
	private String mode;
	


@Override
	public String toString() {
		return "Schedule [id=" + id + ", sessionsName=" + sessionsName + ", duration=" + duration + ", faculty="
				+ faculty + ", mode=" + mode + "]";
	}



/*public Schedule(int id, String sessionsName, int duration, String faculty, String mode) {
		super();
		this.id = id;
		this.sessionsName = sessionsName;
		this.duration = duration;
		this.faculty = faculty;
		this.mode = mode;
	}*/



public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getSessionsName() {
		return sessionsName;
	}



	public void setSessionsName(String sessionsName) {
		this.sessionsName = sessionsName;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public String getFaculty() {
		return faculty;
	}



	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}



	public String getMode() {
		return mode;
	}



	public void setMode(String mode) {
		this.mode = mode;
	}



public void Schedule() {
	
}
}