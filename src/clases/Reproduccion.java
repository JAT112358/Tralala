package clases;

import java.util.Date;

/**
 * @author Jordan Aranda Tejada
 */

public class Reproduccion {

	private Cancion	cancion;
	private Date	fecha;
	private Usuario	usuario;
	private Pago	pago;

	public Reproduccion()
	{

	}

	public Reproduccion(Cancion cancion, Date fecha, Usuario usuario, Pago pago)
	{
		this.cancion = cancion;
		this.fecha = fecha;
		this.usuario = usuario;
		this.pago = pago;
	}

	public Cancion getCancion()
	{
		return cancion;
	}

	public void setCancion(Cancion cancion)
	{
		this.cancion = cancion;
	}

	public Date getFecha()
	{
		return fecha;
	}

	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	public Usuario getUsuario()
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}

	public Pago getPago()
	{
		return pago;
	}

	public void setPago(Pago pago)
	{
		this.pago = pago;
	}
}