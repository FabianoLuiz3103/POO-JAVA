package Exercícios;

import java.util.Scanner;

public class ExecuLampa 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		Lampada lp = new Lampada();
		
		lp.ligar();
		
		lp.MostrarEstado();
		
		lp.desligar();
		
		lp.MostrarEstado();
		lp.MudarEstado();
		lp.MostrarEstado();
		
	}

}
