
public interface Account {

	void withdraw(long amount) throws InsuficientFundException;

	void deposit(long amount);

}