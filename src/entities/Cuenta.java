package entities;

public class Cuenta {

	private String	banco;
	private long	numero;
	private Usuario	usuario;

	public Cuenta()
	{

	}

	public Cuenta(String banco, long numero, Usuario usuario)
	{
		this.banco = banco;
		this.numero = numero;
		this.usuario = usuario;
	}

	public String getBanco()
	{
		return banco;
	}

	public void setBanco(String banco)
	{
		this.banco = banco;
	}

	public long getNumero()
	{
		return numero;
	}

	public void setNumero(long numero)
	{
		this.numero = numero;
	}

	public Usuario getUsuario()
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}
}