package com.jvoq.microservicios.reportes.app.models.documents;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "clients")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {
  
  @JsonProperty("id_cliente")
  private String idCliente;
  @JsonProperty("tipo_documento")
  private String tipoDocumento;
  @JsonProperty("numero_documento")
  private String numDocumento;
  private String nombres;
  private String correo;
  private String direccion;
  private String telefono;
  @JsonProperty("tipo_cliente")
  private String tipoCliente;
  @JsonIgnoreProperties({ "id_cliente", "correo", "direccion", "telefono", "representantes", "fecha_creacion" })
  private List<Client> representantes;
  @JsonProperty("fecha_creacion")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima")
  private Date fechaCreacion;
  private boolean juridico;

}
