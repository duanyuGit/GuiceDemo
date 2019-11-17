package com.wsj.test.module;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Module里面配置专配规则。
 * <p>
 * 我们可以不使用@ImplementedBy注解，因为这样不优雅，
 * 谁会在定义接口的时候就能预知实现类的名称呢。我们可以使用Guice Module定义装配规则，
 * 它相当于Spring的XML文件，只不过它的装配规则都是使用代码定义的。
 * 你可能会辩解说代码定义怎么能比得上XML定义呢，
 * 其实Guice Module在一个大型项目中也是非常的简洁，
 * 一般只会占用几十行代码，Module里面配置的仅仅是特殊的专配规则。
 * 能规则的可读性而言，代码要比XML舒服的多。
 */
public class HelloWorld {

    @Inject
    private IHelloPrinter printer;

    public void print() {
        printer.print();
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new HelloModule());
        HelloWorld helloWorld = injector.getInstance(HelloWorld.class);
        helloWorld.print();
    }

}
