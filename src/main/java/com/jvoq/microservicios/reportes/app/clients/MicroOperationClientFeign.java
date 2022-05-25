package com.jvoq.microservicios.reportes.app.clients;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.jvoq.microservicios.reportes.app.models.documents.Account;
import com.jvoq.microservicios.reportes.app.models.documents.Credit;
import com.jvoq.microservicios.reportes.app.models.documents.Transaction;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@ReactiveFeignClient(name = "jvoq-microservicio-operaciones", url = "localhost:8090")
public interface MicroOperationClientFeign {
  
  @GetMapping("/api/operations/accounts") 
  public Flux<Account> findAllAccount();
  
  @GetMapping("/api/operations/accounts/{id}") 
  public Mono<Account> findAccountById(@PathVariable String id);
  
  @GetMapping("/api/operations/accounts/client/{idClient}")
  public Flux<Account> getAccountByIdClient(@PathVariable String idClient);
  
  
  @GetMapping("/api/operations/credits")
  public Flux<Credit> findCreditAll();
  
  @GetMapping("/api/operations/credits/{id}")
  public Mono<Credit> findCreditById(@PathVariable String id);
  
  @GetMapping("/api/operations/credits/client/{idClient}")
  public Flux<Credit> getCreditByIdClient(@PathVariable String idClient);
  
  
  @GetMapping("/api/operations/transactions")
  public Flux<Transaction> findAllTransaction();
  
  @GetMapping("/api/operations/transactions/{id}")
  public Mono<Transaction> findTransactionById(@PathVariable String id);

}
