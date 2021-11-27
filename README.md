# Coin-Base Price Demo

* This application will simulate a stream of data showing buy prices to buy from coinbase

## How to start the application

* Execute `./gradlew bootR`
* You will need the `Authorization` token from the [CoinBase API here](https://docs.cloud.coinbase.com/sign-in-with-coinbase/docs/api-prices)
* Open a terminal and execute `curl -N http://localhost:8080/buy-price -H 'Authorization: Bearer <TOKEN_FROM_COINBASE_HERE>`
* You should see a stream of data showing every second