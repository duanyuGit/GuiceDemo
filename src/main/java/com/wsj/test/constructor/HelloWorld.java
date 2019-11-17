package com.wsj.test.constructor;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

/**
 * 使用@Named名称指令来指定依赖注入实现
 */
public class HelloWorld {

    @Named("simple")
    private IHelloPrinter simplePrinter;
    @Named("complex")
    private IHelloPrinter complexPrinter;

    // 注意参数也需要添加注解，否则会混乱
    @Inject
    public HelloWorld(@Named("simple") IHelloPrinter simplePrinter, @Named("complex") IHelloPrinter complexPrinter) {
        this.simplePrinter = simplePrinter;
        this.complexPrinter = complexPrinter;
    }

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
