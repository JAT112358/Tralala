package entities;

import java.util.Date;

/**
 * @author Jordan Aranda Tejada
 */

public class Reproduction {

	private Song	song;
	private Date	date;
	private User	user;
	private Payment	payment;

	public Reproduction()
	{

	}

	public Reproduction(Song song, Date date, User user, Payment payment)
	{
		this.song = song;
		this.date = date;
		this.user = user;
		this.payment = payment;
	}

	public Song getSong()
	{
		return song;
	}

	public void setSong(Song song)
	{
		this.song = song;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public Payment getPayment()
	{
		return payment;
	}

	public void setPayment(Payment payment)
	{
		this.payment = payment;
	}
}