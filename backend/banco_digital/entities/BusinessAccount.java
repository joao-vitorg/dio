package banco_digital.entities;

public class BusinessAccount extends Account {
	private final double loanLimit;

	public BusinessAccount(String holder, double initialBalance, double loanLimit) {
		super(holder, initialBalance);
		this.loanLimit = loanLimit;
	}

}
