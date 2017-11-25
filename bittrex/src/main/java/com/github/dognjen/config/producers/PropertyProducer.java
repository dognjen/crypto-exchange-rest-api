package com.github.dognjen.config.producers;

import com.github.dognjen.config.annotations.StringProperty;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.spi.InjectionPoint;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Dejan Ognjenović on 25/11/2017.
 */
public class PropertyProducer {

    private Properties properties;

    @PostConstruct
    public void init() {
        this.properties = new Properties();

        InputStream stream = PropertyProducer.class.getResourceAsStream("/application.properties");

        if (stream == null) {
            // TODO
        }

        try {
            this.properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
            // TODO
        }

    }

    public String getString(InjectionPoint value) {

        return this.properties.getProperty(getProperty(value));
    }

    private String getProperty(InjectionPoint value) {

        return value.getAnnotated().isAnnotationPresent(StringProperty.class)
                && !value.getAnnotated().getAnnotation(StringProperty.class).value().isEmpty()
                ? value.getAnnotated().getAnnotation(StringProperty.class).value() : value.getMember().getName();

    }
}
