package com.serviceregistry.contactserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ContactServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactServiceRegistryApplication.class, args);
	}

}
