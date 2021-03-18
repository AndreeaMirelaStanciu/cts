package ro.ase.csie.cts.seminar4;

import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.seminar4.banking.Bank;
import ro.ase.csie.cts.seminar4.banking.BankAccount;
import ro.ase.csie.cts.seminar4.banking.CreditBankAccount;
import ro.ase.csie.cts.seminar4.banking.DebitBankAccount;
import ro.ase.csie.cts.seminar4.banking.EmailNotificationService;
import ro.ase.csie.cts.seminar4.banking.InsuficientFundException;
import ro.ase.csie.cts.seminar4.banking.NotificationService;
import ro.ase.csie.cts.seminar4.banking.Person;
import ro.ase.csie.cts.seminar4.singleton.Elvis;
import ro.ase.csie.cts.seminar4.singleton.ElvisV2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationService emailService = new EmailNotificationService();
		
		Person p3 = new Person("Van Damme");
		p3.setEmail("Damme@Van.com");
		p3.setMobile("07489753847");
		
		CreditBankAccount bankAccount=CreditBankAccount.createCreditBankAccountWithBalance(emailService, "INGB234567", p3, 100);
		CreditBankAccount b1=CreditBankAccount.createCreditBankAccountWithoutBalance(emailService, "RZ12345", p3);
		
		BigInteger bi=new BigInteger(24,11,new Random());
		BigInteger.probablePrime(12, new Random());
		
		Boolean value=Boolean.valueOf(false);
		
		bankAccount.deposit(50);
		
		System.out.println(bankAccount.toString());
		
		Elvis elvis = Elvis.getInstance();
		
		elvis.sing();
		
		Elvis elvis2 = Elvis.getInstance();
		
		System.out.println(elvis == elvis2);
		
		ElvisV2 elvisV2 = ElvisV2.INSTANCE; 
		elvisV2.sing();
		
		Bank bank = Bank.getInstance();
		DebitBankAccount debit1 = bank.openDebitAccount(p3);
		
		debit1.deposit(20);
		try {
			debit1.withdraw(15);
		} catch (InsuficientFundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(debit1);
	}

}
