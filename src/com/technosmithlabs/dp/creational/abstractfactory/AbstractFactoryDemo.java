package com.technosmithlabs.dp.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String args[]) {
        AbstractFactory abstractFactory = new AbstractFactoryImpl();
        LoanFactory loanFactory = (LoanFactory) abstractFactory.getFactory("loan");
        BankFactory bankFactory = (BankFactory) abstractFactory.getFactory("bank");
        System.out.println("Emi calculated for " + bankFactory.getBank(Banks.HDFC).getBankName() + " is: " + bankFactory.getBank(Banks.HDFC).calculateEmiForLoan(1000000L, loanFactory.getLoanType(LoanType.HOME_LOAN).getRate()));
        System.out.println("Emi calculated for " + bankFactory.getBank(Banks.SBI).getBankName() + " is: " + bankFactory.getBank(Banks.SBI).calculateEmiForLoan(2000000L, loanFactory.getLoanType(LoanType.EDUCATION_LOAN).getRate()));
    }
}
