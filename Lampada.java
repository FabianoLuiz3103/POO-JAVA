package Exerc�cios;

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
    		 System.out.println("A l�mpada est� ligada");
    	 }
    	 else 
    	 {
    		 System.out.println("A l�mpada est� desligada");
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

