package com.wsj.test.map;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.multibindings.Multibinder;

public class HelloModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder<String, IHelloPrinter> printers = MapBinder.newMapBinder(binder(), String.class, IHelloPrinter.class);
        printers.addBinding("simple").to(SimpleHelloPrinter.class);
        printers.addBinding("complex").to(ComplexHelloPrinter.class);
    }
}
