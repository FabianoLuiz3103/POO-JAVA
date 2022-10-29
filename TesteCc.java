package Exercícios;

import java.util.Scanner;

public class TesteCc 
{  
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.setNumero("11");
		
		cc.setAgencia("333");
		
		cc.setContaEspecial(false);
		
		cc.setLimEspecial(500.0);
		
		cc.setSaldo(-10);
		
		
		boolean saqueEf = cc.setSaque(480);		

if(saqueEf)
{
	System.out.println("SSSSS");
	cc.setVerSaldo(0);
}
else
{
	System.out.println("NNNN");
}

 saqueEf = cc.setSaque(500);
 
 System.out.println("TENTATIVA 300");

if(saqueEf)
{
	System.out.println("SSSSS");
	cc.setVerSaldo(0);
}
else
{
	System.out.println("NNNN");
}
	
cc.setVerSaldo(0);

if(cc.isVerCE())
{
	System.out.println("Esta usa");
}
else
{
	System.out.println("Nao es");
}
		

	}

}
