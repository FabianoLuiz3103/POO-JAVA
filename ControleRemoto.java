package Projs;

public class ControleRemoto implements Controlador

{
	

private int volume;
private boolean ligado;
private boolean tocando;

public ControleRemoto()
{
	this.setVolume(50);
	this.setLigado(false);
	this.setTocando(false);
}

private int getVolume() {
	return volume;
}

private void setVolume(int v) {
	this.volume = v;
}

private boolean isLigado() {
	return ligado;
}

private void setLigado(boolean l) {
	this.ligado = l;
}

private boolean isTocando() {
	return tocando;
}

private void setTocando(boolean t) {
	this.tocando = t;
}


	@Override
	public void ligar() {
		
		this.setLigado(true);
		System.out.println("Rádio ligado...");
	}

	@Override
	public void desligar() {
		
		this.setLigado(false);
		System.out.println("Rádio desligado...");
		
	}

	@Override
	public void abrirMenu() {
		
		System.out.println("\n----- MENU ------");
		System.out.println("Abrindo o menu... ");
		System.out.println("Está ligado? " + this.isLigado());
		System.out.println("Está tocando? " + this.isTocando());
		System.out.print("Volume " + this.getVolume());
		
		for(int i = 0; i < this.getVolume(); i+=10)
		{
			System.out.print(" | ");
		}
		System.out.println(" ");
		
	}

	@Override
	public void fecharMenu() {
		
		System.out.println("Fechando o menu...");
		
	}

	@Override
	public void maisVolume() {
		
		if(this.isLigado() == true)
		{
			this.setVolume(this.getVolume() + 10);
			
		}
		
		
	}

	@Override
	public void menosVolume() {
		
		if(this.isLigado() == true)
		{
			this.setVolume(this.getVolume() - 10);
			
		}
	}

	@Override
	public void ligarMudo() {
		
		if(this.isLigado() == true && this.getVolume() > 0)
		{
			this.setVolume(0);
			
			System.out.println("O volume está no mudo!");
		}
		
	}

	@Override
	public void desligarMudo() {
		
		if(this.isLigado() == true && this.getVolume() == 0)
		{
			this.setVolume(50);
			
			System.out.println("O volume saiu do mudo e é de: " + this.getVolume() );
		}		
	}

	@Override
	public void play() {
		
		if(this.isLigado() == true && !(this.isTocando() == true))
		{
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		
		if(this.isLigado()== true && this.isTocando() == true)
		{
			this.setTocando(false);
		}
		
	}
	
	
	

}
