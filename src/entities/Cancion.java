package entities;

public class Cancion {

	private String	titulo;
	private int		duracion;
	private String	letra;
	private String	album;
	private String	artista;
	private String	tipo;
	private double	precio;

	public Cancion()
	{

	}

	public Cancion(String titulo, int duracion, String letra, String album, String artista,
			String tipo, double precio)
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.letra = letra;
		this.album = album;
		this.artista = artista;
		this.tipo = tipo;
		this.precio = precio;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public int getDuracion()
	{
		return duracion;
	}

	public void setDuracion(int duracion)
	{
		this.duracion = duracion;
	}

	public String getLetra()
	{
		return letra;
	}

	public void setLetra(String letra)
	{
		this.letra = letra;
	}

	public String getAlbum()
	{
		return album;
	}

	public void setAlbum(String album)
	{
		this.album = album;
	}

	public String getArtista()
	{
		return artista;
	}

	public void setArtista(String artista)
	{
		this.artista = artista;
	}

	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public double getPrecio()
	{
		return precio;
	}

	public void setPrecio(double precio)
	{
		this.precio = precio;
	}
}