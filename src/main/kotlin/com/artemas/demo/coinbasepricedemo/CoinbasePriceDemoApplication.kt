package com.artemas.demo.coinbasepricedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@EnableWebFlux
@SpringBootApplication
class CoinbasePriceDemoApplication

fun main(args: Array<String>) {
    runApplication<CoinbasePriceDemoApplication>(*args)
}
