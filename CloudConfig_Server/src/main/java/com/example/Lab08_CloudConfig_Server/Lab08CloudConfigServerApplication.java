package com.example.Lab08_CloudConfig_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class Lab08CloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab08CloudConfigServerApplication.class, args);
	}

}
