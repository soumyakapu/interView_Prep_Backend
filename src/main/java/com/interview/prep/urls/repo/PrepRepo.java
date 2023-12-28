package com.interview.prep.urls.repo;

import com.interview.prep.urls.model.PrepUrl;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import reactor.core.publisher.Mono;

@EnableReactiveMongoRepositories
public interface PrepRepo extends ReactiveMongoRepository<PrepUrl,String> {
}
