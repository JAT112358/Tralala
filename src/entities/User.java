package entities;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jordan Aranda Tejada
 */

public class User {

	private String				email;			// Max 50
	private String				name;			// Max 30
	private String				lastname;		// Max 50
	private String				paypalAccount;	// Max 50
	private String				paypalPassword; // Max 20
	private Set<Address>		addresses;
	private Set<Account>		accounts;
	private Set<Payment>		payments;
	private Set<Reproduction>	reproductions;

	public User()
	{

	}

	public User(String email, String name, String lastname, String paypalAccount,
			String paypalPassword)
	{
		this.email = email;
		this.name = name;
		this.lastname = lastname;
		this.paypalAccount = paypalAccount;
		this.paypalPassword = paypalPassword;
		this.addresses = new HashSet<Address>();
		this.accounts = new HashSet<Account>();
		this.payments = new HashSet<Payment>();
		this.reproductions = new HashSet<Reproduction>();
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public String getPaypalAccount()
	{
		return paypalAccount;
	}

	public void setPaypalAccount(String paypalAccount)
	{
		this.paypalAccount = paypalAccount;
	}

	public String getPaypalPassword()
	{
		return paypalPassword;
	}

	public void setPaypalPassword(String paypalPassword)
	{
		this.paypalPassword = paypalPassword;
	}

	// ADDRESSES
	public void addAddress(Address address)
	{
		addresses.add(address);
	}

	public void removeAddress(Address address)
	{
		addresses.remove(address);
	}

	public Set<Address> getAddresses()
	{
		return addresses;
	}

	public int getNumberOfAddresses()
	{
		return addresses.size();
	}

	// ACCOUNTS
	public void addAccount(Account account)
	{
		accounts.add(account);
	}

	public void removeAccount(Account account)
	{
		accounts.remove(account);
	}

	public Set<Account> getAccounts()
	{
		return accounts;
	}

	public int getNumberOfAccounts()
	{
		return accounts.size();
	}

	// PAYMENTS
	public void addPayment(Payment payment)
	{
		payments.add(payment);
	}

	public void removePayment(Payment payment)
	{
		payments.remove(payment);
	}

	public Set<Payment> getPayments()
	{
		return payments;
	}

	public int getNumberOfPayments()
	{
		return payments.size();
	}

	// REPRODUCTIONS
	public void addReproduction(Reproduction reproduction)
	{
		reproductions.add(reproduction);
	}

	public void removeReproduction(Reproduction reproduction)
	{
		reproductions.remove(reproduction);
	}

	public Set<Reproduction> getReproductions()
	{
		return reproductions;
	}

	public int getNumberOfReproductions()
	{
		return reproductions.size();
	}

	// To String
	@Override
	public String toString()
	{
		return "User [name=" + name + ", lastname=" + lastname + "]";
	}

	// Monthly amount
	public double getMonthlyAmount()
	{
		double total = 0;
		// TO DO Get monthly amount.
		return total;
	}
}