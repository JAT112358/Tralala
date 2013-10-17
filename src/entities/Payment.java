package entities;

import java.util.Date;
import java.util.Set;

/**
 * @author Jordan Aranda Tejada
 */

public class Payment {

	private Date				date;
	private boolean				paid;
	private User				user;
	private Set<Reproduction>	reproductions;

	public Payment()
	{

	}

	public Payment(Date date, boolean paid, User user)
	{
		this.date = date;
		this.paid = paid;
		this.user = user;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public boolean isPaid()
	{
		return paid;
	}

	public void setPaid(boolean paid)
	{
		this.paid = paid;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public Set<Reproduction> getReproductions()
	{
		return reproductions;
	}

	public void setReproductions(Set<Reproduction> reproductions)
	{
		this.reproductions = reproductions;
	}
}