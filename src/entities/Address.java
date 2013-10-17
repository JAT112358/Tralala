package entities;

/**
 * @author Jordan Aranda Tejada
 */

public class Address {

	private String	address;	// Max 60
	private String	location;	// Max 40
	private String	province;	// Max 40
	private String	country;	// Max 40
	private User	user;

	public Address()
	{

	}

	public Address(String direction, String location, String province, String country, User user)
	{
		this.address = direction;
		this.location = location;
		this.province = province;
		this.country = country;
		this.user = user;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public String getProvince()
	{
		return province;
	}

	public void setProvince(String province)
	{
		this.province = province;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	@Override
	public String toString()
	{
		return address + "\n" + location + "\n" + province + "\n" + country + "\n";
	}
}