package com.info.ThirdDemo;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("project-services3")
public class ProjectService {

	static ArrayList<Project3> projectlist = new ArrayList<>();

	static {
		Project3 p1 = new Project3("101", "APMT", 2);
		Project3 p2 = new Project3("102", "OKM", 3);
		Project3 p3 = new Project3("103", "Vertex", 4);

		projectlist.add(p1);
		projectlist.add(p2);
		projectlist.add(p3);
	}

	// If client is interested in a particular resource
	@Path("project/{pid}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Project3 retrieveProject(@PathParam("pid") String projectId) {
		int index = Integer.parseInt(projectId);
		Project3 project = projectlist.get(index);
		return project;
	}

	@Path("fetch")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	// Client wants to see projects which falls in 6 to 12 months
	public ArrayList<Project3> retrieveProjectByCriteria(@QueryParam("from") int from, @QueryParam("to") int to) {
	System.out.println("Project Service");
	System.out.println(from + "  "+to);
		return projectlist;
	}

}
