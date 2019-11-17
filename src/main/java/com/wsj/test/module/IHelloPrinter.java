package com.wsj.test.module;

import com.google.inject.ImplementedBy;

@ImplementedBy(SimpleHelloPrinter.class)
public interface IHelloPrinter {
    void print();
}
