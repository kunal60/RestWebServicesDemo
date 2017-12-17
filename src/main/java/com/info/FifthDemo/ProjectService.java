package com.info.FifthDemo;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("project-services5")
public class ProjectService {

	static ArrayList<Project5> projectlist = new ArrayList<>();

	static {
		
		Project5 p1 = new Project5("101", "APMT", 2);
		Project5 p2 = new Project5("102", "OKM", 3);
		Project5 p3 = new Project5("103", "Vertex", 4);

		projectlist.add(p1);
		projectlist.add(p2);
		projectlist.add(p3);
	}

	// If client wants to add a resource
	@Path("insert")
	@POST
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	public void addProject(@FormParam("projectId")String id, @FormParam("projectName")String name, @FormParam("duration")int duration ) {
		System.out.println("Size Before " + projectlist.size());
		Project5 project = new Project5(id, name, duration);
		projectlist.add(project);
		System.out.println("Size After " + projectlist.size());
		System.out.println("Resource added Successfully");
	}

}
