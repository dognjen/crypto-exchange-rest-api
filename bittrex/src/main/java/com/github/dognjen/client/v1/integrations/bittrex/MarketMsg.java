package com.github.dognjen.client.v1.integrations.bittrex;

import com.github.dognjen.client.v1.integrations.MessageBittrex;

import java.util.List;

/**
 * Created by Dejan Ognjenović on 26/11/2017.
 */
public class MarketMsg extends MessageBittrex {

    private List<Market> result;

    public List<Market> getResult() {
        return result;
    }

    public void setResult(List<Market> result) {
        this.result = result;
    }
}
