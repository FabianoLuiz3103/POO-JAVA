package Projs;

public class TesteControle {

	public static void main(String[] args) 
	{
		ControleRemoto cr = new ControleRemoto();
		
		cr.ligar();
		cr.maisVolume();
		cr.maisVolume();
		cr.play();
		cr.abrirMenu();
		
		cr.fecharMenu();
		
		

	}

}
