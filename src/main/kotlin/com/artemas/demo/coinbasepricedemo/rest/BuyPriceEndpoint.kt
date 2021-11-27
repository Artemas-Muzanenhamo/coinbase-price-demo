package com.artemas.demo.coinbasepricedemo.rest

import com.artemas.demo.coinbasepricedemo.domain.Price
import org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.WebClient.create
import reactor.core.publisher.Mono

@RestController
class BuyPriceEndpoint(val webClient: WebClient = create()) {

    @GetMapping("/buy-price", produces = [TEXT_EVENT_STREAM_VALUE])
    fun getBuyPrice(@RequestHeader("Authorization") bearerToken: String): Mono<Price> {
        return webClient.get()
            .uri("https://api.coinbase.com/v2/prices/BTC-USD/buy")
            .headers { it.setBearerAuth(bearerToken) }
            .exchangeToMono { it.bodyToMono(Price::class.java) }
    }
}