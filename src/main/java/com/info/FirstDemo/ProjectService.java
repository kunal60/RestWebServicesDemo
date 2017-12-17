package com.info.FirstDemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("project-services")
public class ProjectService {

	@Path("info")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCompanyInfo() {
		return "Infogain India";
	}

	
	
}
