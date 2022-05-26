package com.jvoq.microservicios.reportes.app.controllers;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvoq.microservicios.reportes.app.dtos.DtoReportClient1;
import com.jvoq.microservicios.reportes.app.models.documents.Transaction;
import com.jvoq.microservicios.reportes.app.services.ReportClientService;
import com.jvoq.microservicios.reportes.app.services.ReportTransactionService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/report")
public class ReportTransactionController {

	@Autowired
	private ReportTransactionService reportTransactionService;

	@Autowired
	private ReportClientService reportClientService;

	@GetMapping("/transaction/{ra}/rango/{rb}")
	public Mono<ResponseEntity<Flux<Transaction>>> getAll(@PathVariable String ra, @PathVariable String rb) {
		LocalDate start = LocalDate.parse(ra);
		LocalDate end = LocalDate.parse(rb);
		return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
				.body(reportTransactionService.buscarRangoDeFecha(start, end)));
	}

	@GetMapping("/products/{idClient}")
	public Mono<ResponseEntity<Flux<DtoReportClient1>>> getPromedio(@PathVariable String idClient) {
		return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
				.body(reportClientService.buscarSaldoPromedioMes(idClient)));
	}

	@GetMapping("/products/{idCuenta}/commissions/{ra}/rango/{rb}")
	public Mono<ResponseEntity<Flux<Transaction>>> getComisionPorPorducto(@PathVariable String idCuenta,
			@PathVariable String ra, @PathVariable String rb) {
		return null;
	}
}
