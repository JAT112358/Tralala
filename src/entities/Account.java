package entities;

/**
 * @author Jordan Aranda Tejada
 */

public class Account {

	private String	bank;	// Max 20
	private long	number; // Max 10
	private User	user;

	public Account()
	{

	}

	public Account(String bank, long number, User user)
	{
		this.bank = bank;
		this.number = number;
		this.user = user;
	}

	public String getBank()
	{
		return bank;
	}

	public void setBank(String bank)
	{
		this.bank = bank;
	}

	public long getNumber()
	{
		return number;
	}

	public void setNumber(long number)
	{
		this.number = number;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}
}