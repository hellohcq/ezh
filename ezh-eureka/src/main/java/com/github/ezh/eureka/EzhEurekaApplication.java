package com.github.ezh.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author solor
 */
@EnableEurekaServer
@SpringBootApplication
public class EzhEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EzhEurekaApplication.class, args);
	}
}