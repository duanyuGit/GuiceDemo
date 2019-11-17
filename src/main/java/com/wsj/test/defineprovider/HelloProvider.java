package com.wsj.test.defineprovider;


import com.google.inject.Provider;

public class HelloProvider implements Provider<HelloPrinter> {
    @Override
    public HelloPrinter get() {
        return new HelloPrinter();
    }
}
