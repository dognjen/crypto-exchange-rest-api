package com.github.dognjen.client.v1;

import com.github.dognjen.client.v1.integrations.bittrex.MarketSummary;

import java.util.List;

public interface BittrexClient {

    // general
    void getMarkets();

    void getCurrencies();

    void getTicker();

    List<MarketSummary> getMarketSummaries();

    void getMarketSummary();

    void getOrderBook();

    void getMarketHistory();

    // market
    void buyLimit();

    void sellLimit();

    void cancel();

    void getOpenOrders();

    // account
    void getBalances();

    void getBalance();

    void getDepositAddress();

    void withdraw();

    void getOrder();

    void getOrderHistory();

    void getWithdrawalHistory();

    void getDepositHistory();

}
