package Exercícios;

public class ContaCorrente 
{
	private String numero;
	private String agencia;
	private boolean ContaEspecial;
	private double saldo;
	private double CqEspecial;
	private double LimEspecial;
    private double lim;
	private double saque;
	private double deposito;
	private double verSaldo;
	private boolean VerCE;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public boolean getContaEspecial() {
		return ContaEspecial;
	}
	public void setContaEspecial(boolean ContaEspecial) {
		this.ContaEspecial = true;
	}
	
	public double getSaldo(double valor) {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimEspecial() {
		return LimEspecial;
	}
	public void setLimEspecial(double valor) {
		this.LimEspecial = valor;
	}
	public double getSaque() {
		return saque;
	}
	public boolean setSaque( double valor) {
		
		if(saldo >= valor)
		{
			this.saldo = saldo - valor;	
			return true;
		}
		else
		{
			if(ContaEspecial == true)
			{
			   lim = LimEspecial + saldo;
			    if(lim >= valor)
			    {
			    	this.saldo = saldo - valor;	
					return true;	
			    }
			    else
			    {
		
			    	return false;
			    }
			}
			else
			{
				return false;
			}
		}
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double valor) {
		this.saldo = saldo + valor;
	}
	public void setVerSaldo(double verSaldo) {
		System.out.println("O saldo é: " + saldo);
	}
	public double getVerSaldo() {
		
		return saldo;
		
	}
	public boolean isVerCE() {
		return saldo < 0;
	}
	public void setVerCE(boolean verCE) {
		VerCE = verCE;
	}
	
	
	
	
	

}
