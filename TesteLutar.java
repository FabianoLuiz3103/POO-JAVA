package Projs;

public class TesteLutar {

	public static void main(String[] args) 
	{
      Lutadores[] L = new Lutadores[6];
		
		 L[0] = new Lutadores("Fabiano", "Brasileira", 19,
				               1.72f, 81, 14, 1, 4);
		 
		L[1] = new Lutadores("Luiz", "EUA", 23,
				              1.89f, 82, 28, 0, 2);
		
	 
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(L[1], L[0]);
		UEC01.lutar();
		
		L[1].status();
		L[0].status();
		
	}

}
