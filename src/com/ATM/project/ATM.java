package com.ATM.project;

public class ATM {
    private double balance;
    private double depositAmount;

    public double getDepositAmount()
    {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount)
    {
        this.depositAmount = depositAmount;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getWithdrawAmount()
    {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount)
    {
        this.withdrawAmount = withdrawAmount;
    }

    private double withdrawAmount;

    public ATM()
    {

    }
}
