package com.technosmithlabs.dp.creational.abstractfactory;

public class BankFactory implements AbstractFactory {

    public Bank getBank(Banks bank) {
        switch (bank) {
            case SBI: {
                return new SBIBank();
            }
            case ICICI: {
                return new ICICIBank();
            }
            case HDFC: {
                return new HDFCBank();
            }
        }
        return null;
    }

    @Override
    public AbstractFactory getFactory(String type) {
        return null;
    }
}
