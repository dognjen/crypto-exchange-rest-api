package com.github.dognjen.client.v1.impl;

import com.github.dognjen.client.v1.BittrexClient;
import com.github.dognjen.client.v1.utils.ClientUtils;
import com.github.dognjen.client.v1.utils.properties.BittrexProperties;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * Created by Dejan Ognjenović on 12/11/2017.
 */
@RequestScoped
public class BittrexClientImpl implements BittrexClient {

    @Inject
    Client client;

    @Inject
    BittrexProperties properties;

    private WebTarget target;

    @PostConstruct
    private void init() {

        // TODO if url in config
        target = client.target(ClientUtils.BITTREX_REST_ENDPOINT)
                        .queryParam("apikey", properties.getBittrexApikey())
                        .queryParam("nonce", properties.getBittrexNonce());
    }

    public void getMarkets() {

        target.request(MediaType.APPLICATION_JSON_TYPE).get();


    }

    public void getCurrencies() {

    }

    public void getTicker() {

    }

    public void getMarketSummaries() {

    }

    public void getMarketSummary() {

    }

    public void getOrderBook() {

    }

    public void getMarketHistory() {

    }

    public void buyLimit() {

    }

    public void sellLimit() {

    }

    public void cancel() {

    }

    public void getOpenOrders() {

    }

    public void getBalances() {

    }

    public void getBalance() {

    }

    public void getDepositAddress() {

    }

    public void withdraw() {

    }

    public void getOrder() {

    }

    public void getOrderHistory() {

    }

    public void getWithdrawalHistory() {

    }

    public void getDepositHistory() {

    }
}
