
//principiul SOLID
public class BankAccount implements Account {
	private String iban;
	
	private double balance;//nu au o precizie ff buna, ex in main

	private Person accountHolder;
	
	public Person getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Person accountHolder) {
		this.accountHolder = accountHolder;
	}

	public BankAccount(String iban, Person person) {
		this.iban=iban;
		this.accountHolder = person;
		balance = 0;
	}

	@Override
	public void withdraw(long amount) throws InsuficientFundException {
		if(amount > balance)
			throw new InsuficientFundException("Insuficient funds " + balance);
		System.out.println("withdrawing " + amount + " from " + iban);
		balance -= amount;
	}
	
	@Override
	public void deposit(long amount) {
		System.out.println("adding " + amount + " in " + iban);
		balance += amount;
	}
	
	//generam doar getteri nu si stteri pt ca nu vrem sa fie accesibile aceste date private
	//click dreapta generate getters and setters
	public String getIban() {
		return iban;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [iban=" + iban + ", balance=" + balance + ", accountHolder=" + accountHolder + "]";
	}

	
	
}
