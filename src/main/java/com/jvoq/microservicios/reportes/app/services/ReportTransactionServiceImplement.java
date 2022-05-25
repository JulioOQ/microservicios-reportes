package com.jvoq.microservicios.reportes.app.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvoq.microservicios.reportes.app.models.documents.Transaction;
import com.jvoq.microservicios.reportes.app.models.repository.ReportTransactionRepository;

import reactor.core.publisher.Flux;

@Service
public class ReportTransactionServiceImplement implements ReportTransactionService{
  
  @Autowired
  private ReportTransactionRepository reportTransactionRepository;

  @Override
  public Flux<Transaction> buscarRangoDeFecha(LocalDate a, LocalDate b) {
    // TODO Auto-generated method stub
    return reportTransactionRepository.findByFechaBetween(a, b);
  }




}
