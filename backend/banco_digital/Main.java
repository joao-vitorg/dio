package banco_digital;

import banco_digital.entities.Account;
import banco_digital.entities.BusinessAccount;
import banco_digital.entities.SavingAccount;

public class Main {
	public static void main(String[] args) {
		Account bacc = new BusinessAccount("João", 1000, 1000);
		Account sacc = new SavingAccount("Vitor", 500, .5);

		bacc.transfer(500, sacc);

		System.out.printf("%.2f\n", sacc.getBalance());
	}
}
