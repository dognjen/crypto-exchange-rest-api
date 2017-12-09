package com.github.dognjen.client.v1.integrations.bittrex;

/**
 * Created by Dejan Ognjenović on 09/12/2017.
 */
public class CurrencySummary {

    private String currency;

    private String currencyLong;

    private int minConfirmation;

    private Double txFee;

    private boolean isActive;

    private String coinType;

    private String baseAddress;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyLong() {
        return currencyLong;
    }

    public void setCurrencyLong(String currencyLong) {
        this.currencyLong = currencyLong;
    }

    public int getMinConfirmation() {
        return minConfirmation;
    }

    public void setMinConfirmation(int minConfirmation) {
        this.minConfirmation = minConfirmation;
    }

    public Double getTxFee() {
        return txFee;
    }

    public void setTxFee(Double txFee) {
        this.txFee = txFee;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public String getBaseAddress() {
        return baseAddress;
    }

    public void setBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
    }
}
