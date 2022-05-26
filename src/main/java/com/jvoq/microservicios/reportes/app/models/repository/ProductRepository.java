package com.jvoq.microservicios.reportes.app.models.repository;

import java.time.LocalDate;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.jvoq.microservicios.reportes.app.dtos.ProductDto;
import com.jvoq.microservicios.reportes.app.models.documents.Product;

import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
	public Flux<ProductDto> findByFechaCreacionBetween(LocalDate i, LocalDate f);
}
