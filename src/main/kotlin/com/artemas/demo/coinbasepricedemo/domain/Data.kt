package com.artemas.demo.coinbasepricedemo.domain

data class Data(
    val amount: String,
    val currency: String
)

data class Price(
    val data: Data
)