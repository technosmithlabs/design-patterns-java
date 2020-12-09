package com.technosmithlabs.dp.creational.abstractfactory;

public class LoanFactory implements AbstractFactory {

    public Loan getLoanType(LoanType loans) {
        switch (loans) {
            case HOME_LOAN: {
                return new HomeLoan();
            }
            case CAR_LOAN: {
                return new CarLoan();
            }
            case EDUCATION_LOAN: {
                return new EducationLoan();
            }
        }
        return null;
    }

    @Override
    public AbstractFactory getFactory(String type) {
        return null;
    }
}
