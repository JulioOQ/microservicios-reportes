package com.jvoq.microservicios.reportes.app.services;


import java.time.LocalDate;

import com.jvoq.microservicios.reportes.app.dtos.DtoReportClient1;
import reactor.core.publisher.Flux;


public interface ReportClientService {
  
  public Flux<DtoReportClient1> buscarSaldoPromedioMes(String idCliente);  
  
  public Flux<DtoReportClient1> totalComisionPorProducto(String idCliente,LocalDate start,LocalDate end);  
}
