package com.interview.prep.urls.router;

import com.interview.prep.urls.handler.PrepHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class PrepRouter {
    @Autowired
    private PrepHandler prepHandler;
    @Bean
    public RouterFunction<ServerResponse> doRoute(PrepHandler prepHandler){
        return RouterFunctions.route()
                .POST("/api/v2/add",prepHandler::addUrl)
                .GET("/api/v2/getAll",prepHandler::getAllUrls)
                .build();
    }
}
