package com.wsj.test.named;

import com.google.inject.ImplementedBy;

@ImplementedBy(SimpleHelloPrinter.class)
public interface IHelloPrinter {
    void print();
}
