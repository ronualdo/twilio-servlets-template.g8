package com.twilio.$name;format="lower,word"$.infrastructure.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class $name;format="Camel"$GuiceConfig
        extends GuiceServletContextListener {

    @Override
    public $name;format="Camel"$GuiceConfig() {
        Guice.createInjector(new ServletModule());
    }
}
