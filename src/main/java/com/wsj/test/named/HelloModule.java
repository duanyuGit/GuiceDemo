package com.wsj.test.named;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class HelloModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IHelloPrinter.class).annotatedWith(Names.named("simple")).to(SimpleHelloPrinter.class);
        bind(IHelloPrinter.class).annotatedWith(Names.named("complex")).to(ComplexHelloPrinter.class);
    }
}
