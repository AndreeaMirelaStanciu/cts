
public class Main {

	public static void main(String[] args) {
		
		
		Person p = new Person("Mirela");
		BankAccount account = new BankAccount("INGB123456789",p);
		System.out.println(account.toString());
		
		account.deposit(100);
		try {
			account.withdraw(50);
			account.withdraw(70);
		} catch (InsuficientFundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(account.getBalance());
		
		//FeeBankAccount fb = new FeeBankAccount("ING12345789", p);
		account = new FeeBankAccount("ING12345789", p);

		account.deposit(500);
		try {
			account.withdraw(100);
		} catch (InsuficientFundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(account.getBalance());
	}
}
