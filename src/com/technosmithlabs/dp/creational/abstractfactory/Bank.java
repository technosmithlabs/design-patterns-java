package com.technosmithlabs.dp.creational.abstractfactory;

public interface Bank {

    public String getBankName();

    public default Double calculateEmiForLoan(Long loanAmount, Double rate) {
        return ((loanAmount * rate)/100 + loanAmount)/24;
    }
}
