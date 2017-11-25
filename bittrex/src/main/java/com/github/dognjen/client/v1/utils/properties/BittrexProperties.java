package com.github.dognjen.client.v1.utils.properties;

import com.github.dognjen.config.annotations.StringProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * Created by Dejan Ognjenović on 25/11/2017.
 */
@ApplicationScoped
public class BittrexProperties {

    @Inject
    @StringProperty("bittrex.apikey")
    private String bittrexApikey;

    @Inject
    @StringProperty("bittrex.nonce")
    private String bittrexNonce;

    public String getBittrexApikey() {
        return bittrexApikey;
    }

    public void setBittrexApikey(String bittrexApikey) {
        this.bittrexApikey = bittrexApikey;
    }

    public String getBittrexNonce() {
        return bittrexNonce;
    }

    public void setBittrexNonce(String bittrexNonce) {
        this.bittrexNonce = bittrexNonce;
    }
}
