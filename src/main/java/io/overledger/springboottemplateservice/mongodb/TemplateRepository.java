package io.overledger.springboottemplateservice.mongodb;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface TemplateRepository extends ReactiveMongoRepository<TemplateDocument, UUID> {

    Mono<TemplateDocument> findByTemplateField(String templateField);
    Flux<TemplateDocument> findAllByTemplateField(String templateField);

}
