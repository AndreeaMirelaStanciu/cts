package ro.ase.csie.cts.seminar2;

import java.math.BigDecimal;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar2.solid.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		CalendarUtil cu = new CalendarUtil();
//		
//		//double nu are o precizie ff buna
//		//ex:
//		double d1=1.02;
//		double d2=0.43;
//		System.out.println(d1-d2);//va avea o zecimala in plus in coada
//		
//		//mai bine cu BigDecimal
//		BigDecimal bg1 = new BigDecimal("1.02");
//		BigDecimal bg2 = new BigDecimal("0.43");
//		System.out.println(bg1.subtract(bg2));
//		
//		try {
//			System.out.println(cu.weekDay(1));
//			System.out.println(cu.weekDay2(1));
//			System.out.println(cu.weekDay3(1));
//			//System.out.println(cu.weekDay3(9));
//			System.out.println(cu.weekDay4(1));
//		} catch (IncorectDayException e) {
//			System.out.println(e.getMessage());
//		}
		
		Person p = new Person("Mirela");
		BankAccount account = new BankAccount("INGB123456789",p);
		System.out.println(account.toString());
		
		account.deposit(100);
		account.withdraw(50);
		
		account.withdraw(70);
		
		System.out.println(account.getBalance());
	}

}
