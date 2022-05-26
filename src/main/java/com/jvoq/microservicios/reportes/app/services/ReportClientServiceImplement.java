package com.jvoq.microservicios.reportes.app.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jvoq.microservicios.reportes.app.clients.MicroOperationClientFeign;
import com.jvoq.microservicios.reportes.app.clients.MicroUserClientFeign;
import com.jvoq.microservicios.reportes.app.dtos.DtoReportClient1;
import com.jvoq.microservicios.reportes.app.models.documents.Account;
import com.jvoq.microservicios.reportes.app.models.documents.Credit;
import reactor.core.publisher.Flux;

@Service
public class ReportClientServiceImplement implements ReportClientService {

	@Autowired
	private MicroOperationClientFeign microOperationClientFeign;
	@Autowired
	private MicroUserClientFeign microUserClientFeign;

	@Override
	public Flux<DtoReportClient1> buscarSaldoPromedioMes(String idCliente) {
		DtoReportClient1 dtoReportClient1s = new DtoReportClient1();
		List<Account> accounts = new ArrayList<>();
		List<Credit> credits = new ArrayList<>();

		try {
			microUserClientFeign.findClientById(idCliente).subscribe(c -> dtoReportClient1s.setCliente(c.getNombres()));

			microOperationClientFeign.getAccountByIdClient(idCliente).collectList().subscribe(accounts::addAll);
			microOperationClientFeign.getCreditByIdClient(idCliente).collectList().subscribe(credits::addAll);
			Thread.sleep(1000);
			dtoReportClient1s.setCuentas(accounts);
			dtoReportClient1s.setCreditos(credits);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return Flux.just(dtoReportClient1s);
	}

	@Override
	public Flux<DtoReportClient1> totalComisionPorProducto(String idCliente, LocalDate start, LocalDate end) {
		DtoReportClient1 dtoReportClient1s = new DtoReportClient1();
		List<Account> accounts = new ArrayList<>();
		List<Credit> credits = new ArrayList<>();

		try {
			microUserClientFeign.findClientById(idCliente).subscribe(c -> dtoReportClient1s.setCliente(c.getNombres()));

			microOperationClientFeign.getAccountByIdClient(idCliente).collectList().subscribe(accounts::addAll);
			microOperationClientFeign.getCreditByIdClient(idCliente).collectList().subscribe(credits::addAll);
			Thread.sleep(1000);
			accounts.get(0);
			dtoReportClient1s.setCuentas(accounts);
			dtoReportClient1s.setCreditos(credits);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return Flux.just(dtoReportClient1s);
	}
}
