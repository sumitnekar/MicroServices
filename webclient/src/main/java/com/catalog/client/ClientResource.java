package com.catalog.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.client.RestTemplate;

@Path("/cloudcatalog")
public class ClientResource {

	
	@LoadBalanced
	RestTemplate template ;

	String serviceUrl = "http://localhost:5555l";

	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String about() {
		return "Client for Cloud Catalog";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/dpConnection")
	public String dpConnection() {
		 template = new RestTemplate();
		return template.getForObject(serviceUrl + "/api/dropbox/connection", String.class);
		
	}
}
