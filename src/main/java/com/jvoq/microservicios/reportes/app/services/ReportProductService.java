package com.jvoq.microservicios.reportes.app.services;

import com.jvoq.microservicios.reportes.app.models.documents.Product;

import reactor.core.publisher.Flux;

public interface ReportProductService {
	public Flux<Product> findProductsByFechaBetween(String i, String f);
}
