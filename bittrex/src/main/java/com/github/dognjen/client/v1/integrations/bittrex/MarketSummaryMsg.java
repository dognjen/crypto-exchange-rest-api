package com.github.dognjen.client.v1.integrations.bittrex;

import com.github.dognjen.client.v1.integrations.MessageBittrex;

import java.util.List;

/**
 * Created by Dejan Ognjenović on 26/11/2017.
 */
public class MarketSummaryMsg extends MessageBittrex {

    private List<MarketSummary> result;

    public List<MarketSummary> getResult() {
        return result;
    }

    public void setResult(List<MarketSummary> result) {
        this.result = result;
    }
}
