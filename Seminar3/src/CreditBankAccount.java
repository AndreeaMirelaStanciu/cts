
public class CreditBankAccount extends BankAccount implements Receivable {


	public CreditBankAccount(String iban, Person accountHolder, long balance) {
		this.iban = iban;
		this.accountHolder = accountHolder;
		this.balance = balance;//il cream deja cu o datorie
	}

	@Override
	public void deposit(long amount) {
		this.balance += amount;
		System.out.println("adding " + amount + " in " + iban);

	}

}
