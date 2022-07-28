package entities;

public class BusinessAccount extends Account {
	private final double loanLimit;

	public BusinessAccount(String holder, double initialBalance, double loanLimit) {
		super(holder, initialBalance);
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) this.deposit(amount);
	}
}
