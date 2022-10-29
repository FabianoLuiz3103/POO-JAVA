package Exercícios;

public class Lampada 
{
	boolean ligada;
	
	
     public void ligar()
     {
    	 ligada = true;
     }
     
     public void desligar()
     {
    	 ligada = false;
     }
     
     public void MostrarEstado()
     {
    	 if(ligada == true)
    	 {
    		 System.out.println("A lâmpada está ligada");
    	 }
    	 else 
    	 {
    		 System.out.println("A lâmpada está desligada");
    	 }
    	 
     }
     
     public void MudarEstado()
     {
    	 if(ligada)
    	 {
    		 desligar();
    	 }
    	 else
    	 {
    		 ligar();
    	 }
     }
}

