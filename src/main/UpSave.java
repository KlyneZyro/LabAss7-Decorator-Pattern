package main;

public class UpSave extends AbstractBankAccountDecorator {

    public UpSave(BankAccount bankAccount) {
        super(bankAccount);
    }

    @Override
    public String showAccountType() {
        return "UpSave"; // 
    }

    @Override
    public Double getInterestRate() {
        return 0.04; // 4.0% 
    }

    @Override
    public String showBenefits() {
        // Appends the new benefit to the base benefits [
        return bankAccount.showBenefits() + ", With Insurance";
    }

    @Override
    public Double computeBalanceWithInterest() {
        // Uses the UpSave's highest interest rate (0.04)
        return getBalance() + (getBalance() * getInterestRate());
    }

    // showInfo() and getBalance() are inherited/delegated from AbstractBankAccountDecorator
}