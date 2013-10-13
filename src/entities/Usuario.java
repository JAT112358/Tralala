package entities;

import java.util.Set;

public class Usuario {

	private String				email;
	private String				nombre;
	private String				apellidos;
	private String				cuetaPaypal;
	private String				contrase�aPaypal;
	private Set<Direccion>		direcciones;
	private Set<Cuenta>			cuentas;
	private Set<Pago>			pagos;
	private Set<Reproduccion>	reproducciones;

	public Usuario()
	{

	}

	public Usuario(String email, String nombre, String apellidos, String cuetaPaypal,
			String contrase�aPaypal, Set<Direccion> direcciones, Set<Cuenta> cuentas,
			Set<Pago> pagos, Set<Reproduccion> reproducciones)
	{
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuetaPaypal = cuetaPaypal;
		this.contrase�aPaypal = contrase�aPaypal;
		this.direcciones = direcciones;
		this.cuentas = cuentas;
		this.pagos = pagos;
		this.reproducciones = reproducciones;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellidos()
	{
		return apellidos;
	}

	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	public String getCuetaPaypal()
	{
		return cuetaPaypal;
	}

	public void setCuetaPaypal(String cuetaPaypal)
	{
		this.cuetaPaypal = cuetaPaypal;
	}

	public String getContrase�aPaypal()
	{
		return contrase�aPaypal;
	}

	public void setContrase�aPaypal(String contrase�aPaypal)
	{
		this.contrase�aPaypal = contrase�aPaypal;
	}

	public Set<Direccion> getDirecciones()
	{
		return direcciones;
	}

	public void setDirecciones(Set<Direccion> direcciones)
	{
		this.direcciones = direcciones;
	}

	public Set<Cuenta> getCuentas()
	{
		return cuentas;
	}

	public void setCuentas(Set<Cuenta> cuentas)
	{
		this.cuentas = cuentas;
	}

	public Set<Pago> getPagos()
	{
		return pagos;
	}

	public void setPagos(Set<Pago> pagos)
	{
		this.pagos = pagos;
	}

	public Set<Reproduccion> getReproducciones()
	{
		return reproducciones;
	}

	public void setReproducciones(Set<Reproduccion> reproducciones)
	{
		this.reproducciones = reproducciones;
	}

	public double getImporteMensual()
	{
		double total = 0;
		// TO DO Obtener el importe mensual.
		return total;
	}
}