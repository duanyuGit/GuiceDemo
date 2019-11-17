package com.wsj.test.implementby;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * 演示ImplementedBy注解
 */
public class HelloWorld {

    @Inject
    private IHelloPrinter printer;

    public void print() {
        printer.print();
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        HelloWorld helloWorld = injector.getInstance(HelloWorld.class);
        helloWorld.print();
    }

}
