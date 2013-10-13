package entities;

public class Direccion {

	private String	direccion;
	private String	localidad;
	private String	provincia;
	private String	pais;
	private Usuario	usuario;

	public Direccion()
	{

	}

	public Direccion(String direccion, String localidad, String provincia, String pais,
			Usuario usuario)
	{
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
		this.usuario = usuario;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	public String getLocalidad()
	{
		return localidad;
	}

	public void setLocalidad(String localidad)
	{
		this.localidad = localidad;
	}

	public String getProvincia()
	{
		return provincia;
	}

	public void setProvincia(String provincia)
	{
		this.provincia = provincia;
	}

	public String getPais()
	{
		return pais;
	}

	public void setPais(String pais)
	{
		this.pais = pais;
	}

	public Usuario getUsuario()
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}

	@Override
	public String toString()
	{
		return direccion + "\n" + localidad + "\n" + provincia + "\n" + pais + "\n";
	}
}