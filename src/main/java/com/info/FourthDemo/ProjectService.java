package com.info.FourthDemo;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("project-services4")
public class ProjectService {

	static ArrayList<Project4> projectlist = new ArrayList<>();

	static {
		System.out.println("I am here");
		Project4 p1 = new Project4("101", "APMT", 2);
		Project4 p2 = new Project4("102", "OKM", 3);
		Project4 p3 = new Project4("103", "Vertex", 4);

		projectlist.add(p1);
		projectlist.add(p2);
		projectlist.add(p3);
	}

	// If client wants to add a resource
	@Path("add")
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public void addProject(Project4 project) {
		System.out.println("Size Before " + projectlist.size());
		System.out.println("After adding a project");
		projectlist.add(project);
		System.out.println("Size After " + projectlist.size());
	}

}
