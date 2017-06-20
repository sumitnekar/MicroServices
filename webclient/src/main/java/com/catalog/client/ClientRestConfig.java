package com.catalog.client;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


@ApplicationPath("/api")
@Component
public class ClientRestConfig extends ResourceConfig {
	
	public ClientRestConfig() {
		packages("com.catalog.client");
	}

}
