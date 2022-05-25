package com.jvoq.microservicios.reportes.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


import reactivefeign.spring.config.EnableReactiveFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableReactiveFeignClients
public class MicroserviciosReportesApplication {  

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosReportesApplication.class, args);		
		//LocalDate date = LocalDate.now();		
		
		
	}
	
	

}
