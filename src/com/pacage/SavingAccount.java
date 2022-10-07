package com.pacage;

public class SavingAccount {
    private String accountHolderName;
    private long accountNumber;
    private String openingDate;
    private String status;
    private double availableBalance;
    private double totalBalance;
    private boolean mobileBankingEnabled;
    private double interestRate;
    private String modeOfOperation;



    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    /*public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber(){
        return accountNumber;
    }*/

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setMobileBankingEnabled(boolean mobileBankingEnabled) {
        this.mobileBankingEnabled = mobileBankingEnabled;
    }

    public boolean isMobileBankingEnabled() {
        return mobileBankingEnabled;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }
    public double getAccountBalance(){
        return availableBalance;
    }
    public long accNumberGen(){
        accountNumber = (long) (Math.random()*1000000000000L);
        return accountNumber;
    }
    public double deposit(double depositAmount){
        availableBalance=getAvailableBalance()+depositAmount;
        return availableBalance;
    }
    public double withdraw(double withdrawAmount){
        if(getAvailableBalance() >withdrawAmount)
            availableBalance = getAvailableBalance() - withdrawAmount;
        return availableBalance;
    }
    public double retriveBalance(){
        return getAvailableBalance();
    }
    public void display(){
        System.out.println("Account holder Name = " + accountHolderName);
        System.out.println("accountNumber = " + accountNumber);
        System.out.println("openingDate = " + openingDate);
        System.out.println("status = " + status);
        System.out.println("mobileBankingEnabled = " + mobileBankingEnabled);
        System.out.println("interestRate = " + interestRate);
        System.out.println("modeOfOperation = " + modeOfOperation);
        System.out.println("availableBalance = " + availableBalance);
    }
}
