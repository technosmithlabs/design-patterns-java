package com.technosmithlabs.dp.creational.abstractfactory;

public class AbstractFactoryImpl implements AbstractFactory {
    public AbstractFactory getFactory(String type) {
        switch (type) {
            case "bank": {
                return new BankFactory();
            }
            case "loan": {
                return new LoanFactory();
            }
        }
        return null;
    }
}
