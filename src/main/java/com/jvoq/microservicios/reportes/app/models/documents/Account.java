package com.jvoq.microservicios.reportes.app.models.documents;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({ "idCuenta", "numeroCuenta", "saldo", "moneda", "idCliente", "idProducto", "fechaCreacion" })
public class Account {
  
  @JsonProperty("id_cuenta")
  private String idCuenta;
  
  @JsonProperty("id_producto")
  private String idProducto;
  
  @JsonProperty("id_cliente")
  private String idCliente;
  
  @JsonProperty("numero_cuenta")
  private String numeroCuenta;
  
  private String moneda;
  
  private Double saldo;
  
  @JsonProperty("fecha_creacion")
  private Date fechaCreacion;
  
  @JsonProperty("max_deposito")
  private int maxDeposito;
  
  @JsonProperty("max_retiro")
  private int maxRetiro;
  
  @JsonProperty("com_deposito")
  private Double comDeposito;
  
  @JsonProperty("com_retiro")
  private Double comRetiro;
  
  @JsonProperty("com_mantenimiento")
  private Double comMantenimiento;
  
  //reportes
  private Double salPromedioMes;
  
  private Double totalComision;

}
