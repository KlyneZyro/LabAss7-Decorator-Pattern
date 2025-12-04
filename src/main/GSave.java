package main;

public class GSave extends AbstractBankAccountDecorator {

    public GSave(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public String showAccountType() {
        return "GSave"; // 
    }

    @Override
    public Double getInterestRate() {
        return 0.025; // 2.5% 
    }

    @Override
    public String showBenefits() {
        // Appends the new benefit to the base benefits 
        return bankAccount.showBenefits() + ", GCash Transfer";
    }

    @Override
    public Double computeBalanceWithInterest() {
        // Uses the GSave's higher interest rate (0.025)
        return getBalance() + (getBalance() * getInterestRate()); 
    }
    
    // showInfo() and getBalance() are inherited/delegated from AbstractBankAccountDecorator

}