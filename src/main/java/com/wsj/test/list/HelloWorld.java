package com.wsj.test.list;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provides;

import java.util.List;
import java.util.Set;

/**
 * 演示list注入
 */
public class HelloWorld {

    @Inject
    private List<IHelloPrinter> printers;

    public void print() {
        for (IHelloPrinter printer :
                printers) {
            printer.print();
        }
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new HelloModule());
        HelloWorld helloWorld = injector.getInstance(HelloWorld.class);
        helloWorld.print();
    }

}
