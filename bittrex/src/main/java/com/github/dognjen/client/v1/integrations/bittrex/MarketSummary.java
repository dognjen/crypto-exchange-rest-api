package com.github.dognjen.client.v1.integrations.bittrex;

import com.github.dognjen.client.v1.integrations.MessageBittrex;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Dejan Ognjenović on 26/11/2017.
 */
public class MarketSummary {

    private String marketName;

    private BigDecimal high;

    private BigDecimal low;

    private BigDecimal volume;

    private BigDecimal last;

    private BigDecimal baseVolume;

    private Date timestamp;

    private BigDecimal bid;

    private int openBuyOrders;

    private int openSellOrders;

    private BigDecimal prevDay;

    private Date created;

    private String displayMarketName;

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getLast() {
        return last;
    }

    public void setLast(BigDecimal last) {
        this.last = last;
    }

    public BigDecimal getBaseVolume() {
        return baseVolume;
    }

    public void setBaseVolume(BigDecimal baseVolume) {
        this.baseVolume = baseVolume;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public int getOpenBuyOrders() {
        return openBuyOrders;
    }

    public void setOpenBuyOrders(int openBuyOrders) {
        this.openBuyOrders = openBuyOrders;
    }

    public int getOpenSellOrders() {
        return openSellOrders;
    }

    public void setOpenSellOrders(int openSellOrders) {
        this.openSellOrders = openSellOrders;
    }

    public BigDecimal getPrevDay() {
        return prevDay;
    }

    public void setPrevDay(BigDecimal prevDay) {
        this.prevDay = prevDay;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDisplayMarketName() {
        return displayMarketName;
    }

    public void setDisplayMarketName(String displayMarketName) {
        this.displayMarketName = displayMarketName;
    }
}
