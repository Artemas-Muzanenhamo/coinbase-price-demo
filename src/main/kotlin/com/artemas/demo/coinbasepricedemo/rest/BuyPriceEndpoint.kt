package com.artemas.demo.coinbasepricedemo.rest

import com.artemas.demo.coinbasepricedemo.domain.Price
import org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.time.Duration
import kotlin.random.Random

@RestController
class BuyPriceEndpoint() {

    @GetMapping("/buy-price", produces = [TEXT_EVENT_STREAM_VALUE])
    fun getBuyPrice(): Flux<Price> {
        return Flux.interval(Duration.ofSeconds(1))
            .map { Price(Random.nextInt(5000, 5999).toString(), "GBP") }
    }
}