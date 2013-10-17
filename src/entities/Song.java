package entities;

/**
 * @author Jordan Aranda Tejada
 */

public class Song {

	private String	title;		// Max 30
	private int		duration;	// Max 5
	private String	lyrics;	// Max 1000
	private String	album;		// Max 30
	private String	artist;	// Max 30
	private String	type;		// Max 30
	private double	price;

	public Song()
	{

	}

	public Song(String title, int duration, String lyrics, String album, String artist,
			String type, double precio)
	{
		this.title = title;
		this.duration = duration;
		this.lyrics = lyrics;
		this.album = album;
		this.artist = artist;
		this.type = type;
		this.price = precio;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getDuration()
	{
		return duration;
	}

	public void setDuration(int duration)
	{
		this.duration = duration;
	}

	public String getLyrics()
	{
		return lyrics;
	}

	public void setLyrics(String lyrics)
	{
		this.lyrics = lyrics;
	}

	public String getAlbum()
	{
		return album;
	}

	public void setAlbum(String album)
	{
		this.album = album;
	}

	public String getArtist()
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
}