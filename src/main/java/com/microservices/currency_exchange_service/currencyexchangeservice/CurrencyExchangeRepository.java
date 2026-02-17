package com.microservices.currency_exchange_service.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to); //The implmentaiton would be
    // provided by spring data jpa , it will query the table using from and to
}
