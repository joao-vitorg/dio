package entities;

public class SavingAccount extends Account {
	private final double interestRate;

	public SavingAccount(String holder, double initialBalance, double interestRate) {
		super(holder, initialBalance);
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		deposit(interestRate * getBalance());
	}
}
