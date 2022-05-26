package com.jvoq.microservicios.reportes.app.services;

import com.jvoq.microservicios.reportes.app.models.documents.Account;
import com.jvoq.microservicios.reportes.app.models.documents.Bank;
import com.jvoq.microservicios.reportes.app.models.documents.Client;
import com.jvoq.microservicios.reportes.app.models.documents.Credit;
import com.jvoq.microservicios.reportes.app.models.documents.Product;
import com.jvoq.microservicios.reportes.app.models.documents.Transaction;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AllService {

	public Flux<Account> findAllAccount();

	public Mono<Account> findAccountById(String id);

	public Flux<Account> findAccountByIdClient(String idClient);

	public Flux<Bank> findAllBank();

	public Mono<Bank> findBankById(String id);

	public Flux<Credit> findAllCredit();

	public Mono<Credit> findCreditById(String id);

	public Flux<Credit> findCreditByIdClient(String idClient);

	public Flux<Product> findAllProduct();

	public Mono<Product> findProductById(String id);

	public Flux<Transaction> findAllTransaction();

	public Mono<Transaction> findTransactionById(String id);

	public Flux<Client> findAllClient();

	public Mono<Client> findClientById(String id);
}
