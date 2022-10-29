package Projs;

public class Conta 
{
	private String nome;
	private String tip;
	private int num;
	private int agencia;
	private double saldo;
	private double deposito;
	private double saque;
	private boolean stts;
	String cont;
	
	public Conta()
	{
		saldo = 0;
		stts = false;
		
	}
	public boolean isStts() {
		return stts;
	}

	public void setStts(boolean stts) {
		this.stts = stts;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String t) {
		tip = t;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int n) {
		this.num = n;
		
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agen) {
		this.agencia = agen;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getDeposito() {
		return deposito;
	}
	
	public void temConta(String cont)
	{
		if(cont == "Sim")
		{
			stts = true;
		}
		else 
			if(cont == "Não")
			{
				stts = false;
				
			}
	}

	public void setDeposito(double depo)
	{
		    if(isStts() == true)
		    {
			this.setSaldo(getSaldo() + depo);
			System.out.println("\nDEPOSITO DE R$" + depo + " REALIZADO COM SUCESSO!! ");
			System.out.println("\nO seu saldo atual é de R$: " + getSaldo());
		    }
		else	
		{ 
			System.out.println("SEM CONTA PARA DEPÓSITO... ");
			System.out.println("Abra uma conta! ");
		}
	}
	public double getSaque() {
		return saque;
	}
	public void setSaque(double saq) 
	{
		if(isStts() == true)
		{
			
		if(saq <= getSaldo())
		{
			this.setSaldo(getSaldo() - saq);
			System.out.println("\nSAQUE DE R$" + saq + " REALIZADO COM SUCESSO!! ");
			System.out.println("\nO seu saldo atual é de R$: " + getSaldo());
			
		}
		else
		{
			System.out.println("SEM VALOR PARA SAQUE... ");
		}
		
		}
		else
		{
			System.out.println("SEM CONTA PARA SAQUE... ");
		}
	}
	
	public void abrirConta()
	{
		if(isStts() == false)
		{    System.out.println("SEM CONTA PARA CONSULTA");
			System.out.println("Abrindo conta...");
		
		
		if(getTip().equals("CC"))
		{
			this.setSaldo(50);
			stts = true;
			System.out.println("Parabéns sr(a): " + getNome() + "!\nO Sr(a) abriu uma Conta Corrente ");
			System.out.println("Com um saldo de R$" + this.saldo);
			
		}
		else
			if(getTip().equals("CP"))
			{
				this.setSaldo(150);
				stts = true;
				System.out.println("Parabéns sr(a): " + getNome() + "!\nO Sr(a) abriu uma Conta Poupança");
				System.out.println("\nCom um saldo de R$" + this.saldo);
				
			}
	}
		else
			if(isStts() == true)
			{
				
				if(getTip().equals("CC"))
				{
					this.saldo = 50.0;
					System.out.println("\n\nOlá sr(a): " + getNome() + "!! ");
					System.out.println("Sua conta é do tipo Conta Corrente");
					System.out.println("\nSeu saldo é de: " + getSaldo());
					
				}
				else
					if(getTip().equals("CP"))
					{
						this.saldo = 150.0;
						System.out.println("\n\nOlá sr(a): " + getNome() + "!! ");
						System.out.println("Sua conta é do tipo Conta Poupança!");
						System.out.println("\nSeu saldo é de: " + getSaldo());
	
					}
				
			}
	}
	
	
	public void fecharConta()
	{
		if(getTip().equals("CC"))
		{
		    if(getSaldo() > 0)
		    {
		    	System.out.println("Conta com saldo! ");
		    }
		    else
		    	if(getSaldo() < 0)
		    	{
		    		System.out.println("Conta com débito! ");
		    	}
		    	else 
		    	{
		    		stts = false;
		    		System.out.println("Conta Corrente fechada... ");
		    	}
		}
		else
			if(getTip().equals("CP"))
			{
			    if(saldo > 0)
			    {
			    	System.out.println("Conta com saldo! ");
			    }
			    else
			    	if(saldo < 0)
			    	{
			    		System.out.println("Conta com débito! ");
			    	}
			    	else 
			    	{
			    		stts = false;
			    		System.out.println("Conta Poupança fechada... ");
			    	
			}
			}
	}
	
	
	public void pagarMensal()
	{
		double v;
		
		if(getTip().equals("CC"))
		{ v = 25.00;
			if(this.getSaldo() > v)
			{
				 setSaldo(getSaldo()-v);
				System.out.println("\nTaxa de R$" + v + " retirada!");
				System.out.println("\nO seu saldo atual é: " + getSaldo());
			}
			else
			{
				System.out.println("Sem saldo para taxa...");
			}
		}
		else
			if(getTip().equals("CP"))
			{   v = 75.00;
			    if(this.getSaldo() > v)
			    {
			    	setSaldo(getSaldo()-v);
			    	System.out.println("\nTaxa de R$" + v + " retirada!");
					System.out.println("\nO seu saldo atual é: " + getSaldo());
			    }
			    else
			    {
			    	System.out.println("Sem saldo para taxa...");
			    }
			}
		}
	
	public void status()
	{  		
		System.out.println("\nSeu número de conta é: " + getNum());
		System.out.println("\nSua agência é a: " + getAgencia());
	
		
	}

	
	
	
	

}
