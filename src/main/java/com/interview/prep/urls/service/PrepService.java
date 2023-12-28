package com.interview.prep.urls.service;

import com.interview.prep.urls.model.PrepUrl;
import com.interview.prep.urls.repo.PrepRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PrepService {
    @Autowired
    private PrepRepo prepRepo;
    public Mono<PrepUrl> addUrls(PrepUrl prepUrl){
      return prepRepo.save(prepUrl);
    }
    public Flux<PrepUrl> getAll(){
        return prepRepo.findAll();
    }
}
