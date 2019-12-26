package com.springwebflux.bootcamp.service.eurekaserver.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class SpringwebfluxBootcampServiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebfluxBootcampServiceEurekaServerApplication.class, args);
	}

}
