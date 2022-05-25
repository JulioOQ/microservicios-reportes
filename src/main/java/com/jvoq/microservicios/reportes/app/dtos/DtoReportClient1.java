package com.jvoq.microservicios.reportes.app.dtos;

import java.util.List;

import com.jvoq.microservicios.reportes.app.models.documents.Account;
import com.jvoq.microservicios.reportes.app.models.documents.Credit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoReportClient1 {  
  private String cliente;
  private List<Account> cuentas;
  private List<Credit> creditos;
}
