package com.catalog.dropbox.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dropbox")
public class DropBoxEndPoint {
	
	
	@GET
	@Path("/connection")
	@Produces(MediaType.APPLICATION_JSON)
	public  String connection(){
		return "DropBox Connection";
	}

}
