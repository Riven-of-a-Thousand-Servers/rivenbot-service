package com.danielvm.destiny2bot.factory;

import com.danielvm.destiny2bot.dto.discord.Interaction;
import com.danielvm.destiny2bot.dto.discord.InteractionResponse;
import reactor.core.publisher.Mono;

/**
 * This message factory represents factories that create messages that require a level of
 * user-authentication. It is also an instance of {@link MessageResponseFactory} for simplification
 * purposes
 */
public interface AuthorizedMessageFactory {

  /**
   * Create a message response using contextual interaction data as necessary
   *
   * @param interaction the context of the interaction
   * @return {@link InteractionResponse}
   */
  Mono<InteractionResponse> createResponse(Interaction interaction);
}
