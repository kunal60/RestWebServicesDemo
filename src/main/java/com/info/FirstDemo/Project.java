package com.info.FirstDemo;

import javax.annotation.Resource;

//Resource is an annotation from tomcat jar
//We need two other jars 1)jersey-bundle 1.8 2) asm-all 3.3.1

@Resource
public class Project {

	String id;
	String name;
	int duration;

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
