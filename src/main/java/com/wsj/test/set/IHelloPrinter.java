package com.wsj.test.set;

import com.google.inject.ImplementedBy;

@ImplementedBy(SimpleHelloPrinter.class)
public interface IHelloPrinter {
    void print();
}
