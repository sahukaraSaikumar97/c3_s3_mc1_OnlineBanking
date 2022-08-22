package com.pacage;

public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount object = new SavingAccount();

        object.setAccountNumber(12345678901L);
        object.setAccountHolderName("Sai");
        object.setAvailableBalance(1000);
        object.setStatus("active");
        object.setMobileBankingEnabled(true);
        object.setInterestRate(5);
        object.setModeOfOperation("Self Operation");
        object.setTotalBalance(object.getAvailableBalance());
        object.setOpeningDate("01-04-2016");
        object.deposit(5000);
        object.withdraw(500);
        double balance = object.retriveBalance();
        object.display();
    }
}
