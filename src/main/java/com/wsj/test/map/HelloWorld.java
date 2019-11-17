package com.wsj.test.map;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import java.util.Map;
import java.util.Set;

/**
 * 演示map注入
 */
public class HelloWorld {

    @Inject
    private Map<String,IHelloPrinter> printers;

    public void print() {
        for (String name :
                printers.keySet()) {
            printers.get(name).print();
        }
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new HelloModule());
        HelloWorld helloWorld = injector.getInstance(HelloWorld.class);
        helloWorld.print();
    }

}
