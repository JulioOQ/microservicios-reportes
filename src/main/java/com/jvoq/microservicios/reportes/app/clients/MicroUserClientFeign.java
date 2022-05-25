package com.jvoq.microservicios.reportes.app.clients;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.jvoq.microservicios.reportes.app.models.documents.Client;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@ReactiveFeignClient(name = "jvoq-microservicio-clientes", url = "localhost:8090")
public interface MicroUserClientFeign {

  @GetMapping("/api/clients")
  public Flux<Client> findAllClient();
  
	@GetMapping("/api/clients/{id}")
	public Mono<Client> findClientById(@PathVariable String id);
	

	 
}
