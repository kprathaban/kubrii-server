package com.businesslisting.kubriiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KubriiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubriiServerApplication.class, args);
		System.out.println("Eureka Server started...and Will register any Eureka client up and running");
	}

}
