package com.jvoq.microservicios.reportes.app.clients;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jvoq.microservicios.reportes.app.models.documents.Bank;
import com.jvoq.microservicios.reportes.app.models.documents.Product;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(name = "jvoq-microservicio-productos", url = "localhost:8090")
public interface MicroProductClientFeign {

	@GetMapping("/api/products/banks")
	public Flux<Bank> findAllBank();

	@GetMapping("/api/products/banks/{id}")
	public Mono<Bank> findBankById(@PathVariable String id);

	@GetMapping("/api/products/products")
	public Flux<Product> findAllProduct();

	@GetMapping("/api/products/products/{id}")
	public Mono<Product> findProductById(@PathVariable String id);

	@GetMapping("/api/products/products/{i}/rango/{f}")
	public Flux<Product> findProductsByFechaBetween(@PathVariable String i, @PathVariable String f);
}
