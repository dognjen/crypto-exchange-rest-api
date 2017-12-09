package com.github.dognjen.client.v1.integrations.bittrex;

/**
 * Created by Dejan Ognjenović on 09/12/2017.
 */
public class MarcketTickValues {

    private Double bid;

    private Double ask;

    private Double last;

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Double getLast() {
        return last;
    }

    public void setLast(Double last) {
        this.last = last;
    }
}
