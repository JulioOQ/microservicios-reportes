package com.jvoq.microservicios.reportes.app.models.repository;

import java.time.LocalDate;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.jvoq.microservicios.reportes.app.models.documents.Transaction;
import reactor.core.publisher.Flux;

@Repository
public interface ReportTransactionRepository extends ReactiveMongoRepository<Transaction, String>{

  //@Query("{'fecha':{$gte:?0,$lte:?1}}")
  public Flux<Transaction> findByFechaBetween(LocalDate pa, LocalDate pb);   
  
 

  
  
}
