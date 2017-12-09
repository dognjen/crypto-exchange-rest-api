package com.github.dognjen.client.v1.impl;

import com.github.dognjen.client.v1.BittrexClient;
import com.github.dognjen.client.v1.integrations.bittrex.Market;
import com.github.dognjen.client.v1.integrations.bittrex.MarketSummaryMsg;
import com.github.dognjen.client.v1.utils.ClientUtils;
import com.github.dognjen.client.v1.utils.properties.BittrexProperties;
import com.github.dognjen.client.v1.integrations.bittrex.MarketSummary;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.List;

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
        /*target = client.target(ClientUtils.BITTREX_REST_ENDPOINT)
                        .queryParam("apikey", properties.getBittrexApikey())
                        .queryParam("nonce", properties.getBittrexNonce());
                        */

    }

    public void getMarkets() {
        client.target("https://bittrex.com/api/v1.1/public/getmarkets").
                request(MediaType.APPLICATION_JSON_TYPE).get(Market.class);


    }

    public void getCurrencies() {

        List<MarketSummary> marketSummaries = client.target("https://bittrex.com/api/v1.1/public/getcurrencies").
                request(MediaType.APPLICATION_JSON_TYPE).get(MarketSummaryMsg.class).getResult();

    }

    public void getTicker() {


        List<MarketSummary> marketSummaries = client.target("https://bittrex.com/api/v1.1/public/getticker").
                request(MediaType.APPLICATION_JSON_TYPE).get(MarketSummaryMsg.class).getResult();

    }

    public List<MarketSummary> getMarketSummaries() {

        List<MarketSummary> marketSummaries = client.target("https://bittrex.com/api/v1.1/public/getmarketsummaries").
                request(MediaType.APPLICATION_JSON_TYPE).get(MarketSummaryMsg.class).getResult();

        return marketSummaries;

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
