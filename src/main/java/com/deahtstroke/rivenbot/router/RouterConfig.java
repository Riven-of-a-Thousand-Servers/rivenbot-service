package com.deahtstroke.rivenbot.router;

import com.deahtstroke.rivenbot.dispatcher.DiscordInteractionDispatcher;
import com.deahtstroke.rivenbot.exception.BaseDiscordChatException;
import com.deahtstroke.rivenbot.exception.BaseException;
import com.deahtstroke.rivenbot.filter.SignatureFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Configuration
public class RouterConfig {

  @Bean
  RouterFunction<ServerResponse> interactionRouterFunction(
      DiscordInteractionDispatcher interactionHandler,
      SignatureFilterFunction signatureFilterFunction) {
    return RouterFunctions.route()
        .POST("/interactions", interactionHandler::resolveRequest)
        .filter(signatureFilterFunction)
        .onError(BaseDiscordChatException.class, this::errorChatResponseHandler)
        .onError(BaseException.class, this::errorResponseHandler)
        .build();
  }

  private Mono<ServerResponse> errorResponseHandler(BaseException exception,
      ServerRequest request) {
    return ServerResponse.status(exception.getStatus())
        .contentType(MediaType.APPLICATION_JSON)
        .bodyValue(exception.getMessage());
  }

  private Mono<ServerResponse> errorChatResponseHandler(BaseDiscordChatException chatException,
      ServerRequest request) {
    return ServerResponse.ok()
        .contentType(MediaType.APPLICATION_JSON)
        .body(BodyInserters.fromValue(chatException.getErrorInteractionResponse()));
  }
}
