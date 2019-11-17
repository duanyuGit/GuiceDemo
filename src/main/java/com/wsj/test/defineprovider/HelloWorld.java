package com.wsj.test.defineprovider;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * 演示最基本的provider操作
 */
public class HelloWorld {

    @Inject
    private HelloPrinter printer;
    public void print() {
        printer.print();
    }
    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        HelloWorld helloWorld = injector.getInstance(HelloWorld.class);
        helloWorld.print();
    }

}
