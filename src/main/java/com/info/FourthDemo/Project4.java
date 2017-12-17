package com.info.FourthDemo;

import javax.xml.bind.annotation.XmlRootElement;



//@Resource
@XmlRootElement
public class Project4 {

	public Project4() {
		//If you don't put this default constructor 
	}
	
	String id;
	String name;
	int duration;

	public Project4(String id, String name, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
