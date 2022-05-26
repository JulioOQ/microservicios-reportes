package com.jvoq.microservicios.reportes.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvoq.microservicios.reportes.app.models.documents.Product;
import com.jvoq.microservicios.reportes.app.services.ReportProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/report-products")
public class ReportProductController {
	@Autowired
	private ReportProductService reportProductService;

	@GetMapping("/{i}/rango/{f}")
	public Mono<ResponseEntity<Flux<Product>>> findProductsByFechaBetween(@PathVariable String i,
			@PathVariable String f) {
		return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
				.body(reportProductService.findProductsByFechaBetween(i, f)));
	}
}
