package com.info.SecondDemo;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("project-services2")
public class ProjectService {

	static ArrayList<Project2> projectlist = new ArrayList<>();

	static {
		Project2 p1 = new Project2("101", "APMT", 2);
		Project2 p2 = new Project2("102", "OKM", 3);
		Project2 p3 = new Project2("103", "Vertex", 4);

		projectlist.add(p1);
		projectlist.add(p2);
		projectlist.add(p3);
	}

	@Path("projects")
	@GET
	// @Produces(MediaType.APPLICATION_XML)
	// @Produces(MediaType.APPLICATION_JSON)

	// If this method has two clients:One want output in JSON and other in XML
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ArrayList<Project2> retrieveProjects() {
		return projectlist;
	}

}
