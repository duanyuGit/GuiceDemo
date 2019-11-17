package com.wsj.test.provider;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class HelloModule extends AbstractModule {
    @Provides
    public HelloPrinter provideHelloPrinter() {
        return new HelloPrinter();
    }
}
