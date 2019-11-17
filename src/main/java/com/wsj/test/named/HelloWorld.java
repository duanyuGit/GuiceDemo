package com.wsj.test.named;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

/**
 * 使用@Named名称指令来指定依赖注入实现
 */
public class HelloWorld {

    @Inject
    @Named("simple")
    private IHelloPrinter simplePrinter;
    @Inject
    @Named("complex")
    private IHelloPrinter complexPrinter;

    public void print() {
        simplePrinter.print();
        complexPrinter.print();
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new HelloModule());
        HelloWorld helloWorld = injector.getInstance(HelloWorld.class);
        helloWorld.print();
    }

}
