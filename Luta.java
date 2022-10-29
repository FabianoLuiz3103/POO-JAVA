package Projs;

import java.util.Random;

public class Luta 
{
    private Lutadores desafiante; //Variavel do tipo abstrata;
    private Lutadores desafiado; //Variavel do tipo abstrata;
    private int rounds;
    private boolean aprovada;
    
	public Lutadores getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutadores fiante) {
		this.desafiante = fiante;
	}
	public Lutadores getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutadores fiado) {
		this.desafiado = fiado;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
    
	public void marcarLuta(Lutadores l1, Lutadores l2)
	{
		if((l1.getCategoria().equals(l2.getCategoria()))&&(l1 != l2))
		{
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		}
		else
		{
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
			
		}
		
		
	}
	
	public void lutar()
	{
		if(this.isAprovada() == true)
		{
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentarLutador();
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentarLutador();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			System.out.println("======= RESULTADO ============");
			switch(vencedor)
			{
			case 0: 
				System.out.println("EMPATOU! ");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
			break;
			
			case 1: 
				System.out.println("Vitória do: " + desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
			break;
			
			case 2: 
				System.out.println("Vitória do: " + desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
			}
			System.out.println("====================================");
			
		}
		else
		{
			System.out.println("A luta não pode acontecer!!");
		}
	}
	
    
    
}
