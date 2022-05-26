package com.jvoq.microservicios.reportes.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvoq.microservicios.reportes.app.clients.MicroProductClientFeign;
import com.jvoq.microservicios.reportes.app.models.documents.Product;

import reactor.core.publisher.Flux;

@Service
public class ReportProductServiceImplement implements ReportProductService {

	@Autowired
	MicroProductClientFeign productClientFeign;

	@Override
	public Flux<Product> findProductsByFechaBetween(String i, String f) {
		return productClientFeign.findProductsByFechaBetween(i, f);
	}
}
