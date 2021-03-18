package ro.ase.csie.cts.seminar4.banking;

public class Bank {
	private static Bank INSTANCE;
	
	private NotificationService notificationService;
	
	private Bank() {
		notificationService = new EmailNotificationService();
	}
	
	public static synchronized Bank getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Bank();
		}
		return INSTANCE;
	}
	
	public DebitBankAccount openDebitAccount(Person holder) {
		DebitBankAccount account = new DebitBankAccount(notificationService, generateIban(), holder);
		
		return account;
	}
	
	private String generateIban() {
		return "INGB" + System.currentTimeMillis();
 	}
}
