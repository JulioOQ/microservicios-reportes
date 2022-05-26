package com.jvoq.microservicios.reportes.app.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({ "idProducto", "tipoProducto", "nombre", "descripcion", "costoApertura", "idBanco" })
public class ProductDto {

	@JsonProperty("id_producto")
	private String idProducto;
	@JsonProperty("id_banco")
	private String idBanco;
	@JsonProperty("tipo_producto")
	private String tipoProducto;
	private String nombre;
	private String descripcion;
	private int juridico;
	private int natural;
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
	@JsonProperty("fecha_creacion")
	private Date fechaCreacion;
}
