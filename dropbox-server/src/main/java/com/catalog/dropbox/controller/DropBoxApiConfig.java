package com.catalog.dropbox.controller;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("/api")
@Component
public class DropBoxApiConfig  extends ResourceConfig{
	
	public DropBoxApiConfig() {
		packages("com.catalog.dropbox");
	}
	
	

}
