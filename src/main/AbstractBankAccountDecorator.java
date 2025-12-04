package main;

public abstract class AbstractBankAccountDecorator implements BankAccount, BankAccountDecorator {

    protected BankAccount bankAccount; // The object being wrapped

    public AbstractBankAccountDecorator(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    // Delegation of core methods to the wrapped object

    @Override
    public Double getBalance() {
        return bankAccount.getBalance(); // Delegates to the wrapped account
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo(); // Delegates to the wrapped account
    }
    
  
}