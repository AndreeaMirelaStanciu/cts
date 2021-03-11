
public class EmailNotificationService implements NotificationService{

	@Override
	public void sendNotificationService(Person destination, String msg) {
		System.out.println("Sending email to " + destination);
		System.out.println(msg);
	}

}
