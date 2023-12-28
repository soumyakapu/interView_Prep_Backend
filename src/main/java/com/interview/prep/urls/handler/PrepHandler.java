package com.interview.prep.urls.handler;

import com.interview.prep.urls.model.PrepUrl;
import com.interview.prep.urls.service.PrepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class PrepHandler {
    @Autowired
    private PrepService prepService;
    public Mono<ServerResponse> addUrl(ServerRequest serverRequest){
        Mono<PrepUrl> prepUrlMono = serverRequest.bodyToMono(PrepUrl.class)
                .flatMap(url -> prepService.addUrls(url));

        return ServerResponse.ok().body(prepUrlMono,PrepUrl.class);
    }
    public Mono<ServerResponse> getAllUrls(ServerRequest serverRequest){
        return ServerResponse.ok().body(prepService.getAll(),PrepUrl.class);
    }
}
