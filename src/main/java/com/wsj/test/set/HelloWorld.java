package com.wsj.test.set;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import java.util.Set;

/**
 * 演示set注入
 */
public class HelloWorld {

    @Inject
    private Set<IHelloPrinter> printers;

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
