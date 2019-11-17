package com.wsj.test.list;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.multibindings.Multibinder;

import java.util.ArrayList;
import java.util.List;

public class HelloModule extends AbstractModule {
    @Override
    protected void configure() {
        Multibinder<IHelloPrinter> printers = Multibinder.newSetBinder(binder(), IHelloPrinter.class);
        printers.addBinding().to(SimpleHelloPrinter.class);
        printers.addBinding().to(ComplexHelloPrinter.class);
    }

    @Provides
    List<IHelloPrinter> provideHelloPrinters(SimpleHelloPrinter simpleHelloPrinter, ComplexHelloPrinter complexHelloPrinter) {
        List<IHelloPrinter> helloPrinters = new ArrayList<>();
        helloPrinters.add(simpleHelloPrinter);
        helloPrinters.add(complexHelloPrinter);
        return helloPrinters;
    }

}
