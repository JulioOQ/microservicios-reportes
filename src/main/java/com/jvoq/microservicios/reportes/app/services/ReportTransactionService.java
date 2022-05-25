package com.jvoq.microservicios.reportes.app.services;

import java.time.LocalDate;

import com.jvoq.microservicios.reportes.app.models.documents.Transaction;
import reactor.core.publisher.Flux;

public interface ReportTransactionService {

  public Flux<Transaction> buscarRangoDeFecha(LocalDate a, LocalDate b);  
}
