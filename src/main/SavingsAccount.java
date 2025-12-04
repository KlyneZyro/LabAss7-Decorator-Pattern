package main;

public class SavingsAccount implements BankAccount {

    private String accountNumber;
    private String accountName; //Set to String cuz of leading 0. it might erase if its int
    private Double balance;

    // Getters and Setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Overloading setAccountNumber for integer input 
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = String.valueOf(accountNumber);
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    // Concrete Component Implementation (Base functionality)

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public Double getInterestRate() {
        return 0.01; // 1.0% 
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account"; 
    }

    @Override
    public Double computeBalanceWithInterest() {
        return this.balance + (this.balance * getInterestRate()); 
    }

    @Override
    public String showInfo() {
        // [cite: 47]
        return "Account number: " + accountNumber +
               "\nAccount name: " + accountName +
               "\nBalance: " + String.format("%.1f", balance);
    }
}