package com.technosmithlabs.dp.creational.abstractfactory;

import java.util.AbstractCollection;

public interface AbstractFactory {
    public AbstractFactory getFactory(String type);
}
