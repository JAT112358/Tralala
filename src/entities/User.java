package entities;

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
			String paypalPassword, Set<Address> addresses, Set<Account> accounts,
			Set<Payment> payments, Set<Reproduction> reproductions)
	{
		this.email = email;
		this.name = name;
		this.lastname = lastname;
		this.paypalAccount = paypalAccount;
		this.paypalPassword = paypalPassword;
		this.addresses = addresses;
		this.accounts = accounts;
		this.payments = payments;
		this.reproductions = reproductions;
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

	public Set<Address> getAddresses()
	{
		return addresses;
	}

	public void setAddresses(Set<Address> addresses)
	{
		this.addresses = addresses;
	}

	public Set<Account> getAccounts()
	{
		return accounts;
	}

	public void setAccounts(Set<Account> accounts)
	{
		this.accounts = accounts;
	}

	public Set<Payment> getPayments()
	{
		return payments;
	}

	public void setPayments(Set<Payment> payments)
	{
		this.payments = payments;
	}

	public Set<Reproduction> getReproductions()
	{
		return reproductions;
	}

	public void setReproductions(Set<Reproduction> reproductions)
	{
		this.reproductions = reproductions;
	}

	public double getImporteMensual()
	{
		double total = 0;
		// TO DO Obtener el importe mensual.
		return total;
	}
}