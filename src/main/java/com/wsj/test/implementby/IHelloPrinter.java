package com.wsj.test.implementby;

import com.google.inject.ImplementedBy;

@ImplementedBy(SimpleHelloPrinter.class)
public interface IHelloPrinter {
    void print();
}
