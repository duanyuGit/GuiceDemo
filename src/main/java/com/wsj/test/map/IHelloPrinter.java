package com.wsj.test.map;

import com.google.inject.ImplementedBy;

@ImplementedBy(SimpleHelloPrinter.class)
public interface IHelloPrinter {
    void print();
}
