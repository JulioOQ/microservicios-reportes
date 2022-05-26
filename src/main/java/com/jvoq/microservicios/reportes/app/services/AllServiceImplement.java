package com.jvoq.microservicios.reportes.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jvoq.microservicios.reportes.app.clients.MicroOperationClientFeign;
import com.jvoq.microservicios.reportes.app.clients.MicroProductClientFeign;
import com.jvoq.microservicios.reportes.app.clients.MicroUserClientFeign;
import com.jvoq.microservicios.reportes.app.models.documents.Account;
import com.jvoq.microservicios.reportes.app.models.documents.Bank;
import com.jvoq.microservicios.reportes.app.models.documents.Client;
import com.jvoq.microservicios.reportes.app.models.documents.Credit;
import com.jvoq.microservicios.reportes.app.models.documents.Product;
import com.jvoq.microservicios.reportes.app.models.documents.Transaction;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AllServiceImplement implements AllService {

	@Autowired
	private MicroOperationClientFeign microOperationClientFeign;
	@Autowired
	private MicroProductClientFeign microProductClientFeign;
	@Autowired
	private MicroUserClientFeign microUserClientFeign;

	@Override
	public Flux<Account> findAllAccount() {
		return microOperationClientFeign.findAllAccount();
	}

	@Override
	public Mono<Account> findAccountById(String id) {
		return microOperationClientFeign.findAccountById(id);
	}

	@Override
	public Flux<Account> findAccountByIdClient(String idClient) {
		return microOperationClientFeign.getAccountByIdClient(idClient);
	}

	@Override
	public Flux<Bank> findAllBank() {
		return microProductClientFeign.findAllBank();
	}

	@Override
	public Mono<Bank> findBankById(String id) {
		return microProductClientFeign.findBankById(id);
	}

	@Override
	public Flux<Credit> findAllCredit() {
		return microOperationClientFeign.findCreditAll();
	}

	@Override
	public Mono<Credit> findCreditById(String id) {
		return microOperationClientFeign.findCreditById(id);
	}

	@Override
	public Flux<Credit> findCreditByIdClient(String idClient) {
		return microOperationClientFeign.getCreditByIdClient(idClient);
	}

	@Override
	public Flux<Product> findAllProduct() {
		return microProductClientFeign.findAllProduct();
	}

	@Override
	public Mono<Product> findProductById(String id) {
		return microProductClientFeign.findProductById(id);
	}

	@Override
	public Flux<Transaction> findAllTransaction() {
		return microOperationClientFeign.findAllTransaction();
	}

	@Override
	public Mono<Transaction> findTransactionById(String id) {
		return microOperationClientFeign.findTransactionById(id);
	}

	@Override
	public Flux<Client> findAllClient() {
		return microUserClientFeign.findAllClient();
	}

	@Override
	public Mono<Client> findClientById(String id) {
		return microUserClientFeign.findClientById(id);
	}
}
