package com.github.dognjen.client.service.producers;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Created by Dejan Ognjenović on 25/11/2017.
 */
public class ClientProducer {

    @Produces
    @ApplicationScoped
    public Client getRestClient() {
        return ClientBuilder.newClient();
    }
}
