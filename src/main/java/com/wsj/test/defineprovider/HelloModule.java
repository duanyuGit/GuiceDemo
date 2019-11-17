package com.wsj.test.defineprovider;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class HelloModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloPrinter.class).toProvider(HelloProvider.class);
    }
}
