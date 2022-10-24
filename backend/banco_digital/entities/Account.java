package banco_digital.entities;

public abstract class Account {
	private double balance;

	protected Account(String holder, double initialBalance) {
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
