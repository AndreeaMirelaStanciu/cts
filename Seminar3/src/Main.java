import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		Map<Person, Receivable> employees = new HashMap <> ();
		
		//cream persoane pe care sa le adaugam in structura
		Person p1 = new Person("Chuck Noris");
		CreditBankAccount b1 = new CreditBankAccount("RF4876R8734678434", p1,-500);
		
		Person p2 = new Person("Arnols");
		DebitBankAccount b2 = new FeeBankAccount("ING4876R8734678434", p2);
		
		Person p3 = new Person("Van Damme");
		DebitBankAccount b3 = new DebitBankAccount("BT4876R8734678434", p3);
		
		employees.put(p1, b1);
		employees.put(p2, b2);
		employees.put(p3, b3);
		
		//e ziua de salariu si vrem sa le adaugam bani in cont
		for(Receivable a : employees.values()) {
			a.deposit(1000);
		}
		
		Map<Person, Payable> union = new HashMap<>();
		union.put(p2, b2);
		union.put(p3, b3);
		
		for(Payable a : union.values()) {
			try {
				a.withdraw(10);
			} catch (InsuficientFundException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		try {
			b2.transfer(b3, 200);
		} catch (InsuficientFundException e) {
			System.out.println(e.getMessage());
		}
	}
}
