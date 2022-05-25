package com.jvoq.microservicios.reportes.app.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jvoq.microservicios.reportes.app.models.documents.Account;
import com.jvoq.microservicios.reportes.app.models.documents.Bank;
import com.jvoq.microservicios.reportes.app.models.documents.Client;
import com.jvoq.microservicios.reportes.app.models.documents.Credit;
import com.jvoq.microservicios.reportes.app.models.documents.Product;
import com.jvoq.microservicios.reportes.app.models.documents.Transaction;
import com.jvoq.microservicios.reportes.app.services.AllService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/all")
public class AllController {

  @Autowired
  private AllService allService;

  @GetMapping("/banks")
  public Mono<ResponseEntity<Flux<Bank>>> getBanks() {
    return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(allService.findAllBank()));
  }

  @GetMapping("/banks/{id}")
  public Mono<ResponseEntity<Bank>> getBankById(@PathVariable String id) {
    return allService.findBankById(id).map(b -> ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(b))
        .defaultIfEmpty(ResponseEntity.notFound().build());
  }

  @GetMapping("/products")
  public Mono<ResponseEntity<Flux<Product>>> getProducts() {
    return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(allService.findAllProduct()));
  }

  @GetMapping("/products/{id}")
  public Mono<ResponseEntity<Product>> getProductById(@PathVariable String id) {
    return allService.findProductById(id).map(b -> ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(b))
        .defaultIfEmpty(ResponseEntity.notFound().build());

  }

  @GetMapping("/clients")
  public Mono<ResponseEntity<Flux<Client>>> getClients() {
    return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(allService.findAllClient()));
  }

  @GetMapping("/clients/{id}")
  public Mono<ResponseEntity<Client>> getClientById(@PathVariable String id) {
    return allService.findClientById(id).map(b -> ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(b))
        .defaultIfEmpty(ResponseEntity.notFound().build());
  }

  @GetMapping("/accounts")
  public Mono<ResponseEntity<Flux<Account>>> getAccounts() {
    return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(allService.findAllAccount()));
  }

  @GetMapping("/accounts/{id}")
  public Mono<ResponseEntity<Account>> getAccountById(@PathVariable String id) {
    return allService.findAccountById(id).map(b -> ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(b))
        .defaultIfEmpty(ResponseEntity.notFound().build());
  }
  
  @GetMapping("/accounts/client/{idClient}")
  public Mono<ResponseEntity<Flux<Account>>> getAccountByIdClient(@PathVariable String idClient) {
    return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(allService.findAccountByIdClient(idClient)));

  }

  @GetMapping("/credits")
  public Mono<ResponseEntity<Flux<Credit>>> getCredits() {
    return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(allService.findAllCredit()));
  }

  @GetMapping("/credits/{id}")
  public Mono<ResponseEntity<Credit>> getCreditById(@PathVariable String id) {
    return allService.findCreditById(id).map(b -> ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(b))
        .defaultIfEmpty(ResponseEntity.notFound().build());
  }

  @GetMapping("/transactions")
  public Mono<ResponseEntity<Flux<Transaction>>> gettransactions() {
    return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(allService.findAllTransaction()));
  }

  @GetMapping("/transactions/{id}")
  public Mono<ResponseEntity<Transaction>> gettransactionById(@PathVariable String id) {
    return allService.findTransactionById(id).map(b -> ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(b))
        .defaultIfEmpty(ResponseEntity.notFound().build());
  }

}
