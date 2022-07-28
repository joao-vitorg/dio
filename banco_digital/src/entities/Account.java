package entities;

public abstract class Account {
	private final String holder;
	private double balance;

	public Account(String holder, double initialBalance) {
		this.holder = holder;
		deposit(initialBalance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public boolean withdraw(double amount) {
		if (balance < amount) return false;

		balance -= amount;
		return true;
	}

	public void transfer(double amount, Account account) {
		if (this.withdraw(amount)) account.deposit(amount);
	}

	public double getBalance() {
		return balance;
	}
}
