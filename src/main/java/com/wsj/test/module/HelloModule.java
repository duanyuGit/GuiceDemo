package com.wsj.test.module;

import com.google.inject.AbstractModule;

public class HelloModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IHelloPrinter.class).to(SimpleHelloPrinter.class);
    }
}
