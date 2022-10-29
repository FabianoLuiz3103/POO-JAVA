package HERANÇA;

public class Bolsista extends Aluno
{
    private int bolsa;
	
	public Bolsista(String nome, String sexo, int idade, String matri, String curso) {
		super(nome, sexo, idade, matri, curso);
		// TODO Auto-generated constructor stub
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	
	@Override
	public void pagarMatri()
	{
		System.out.println(this.getNome() + " é bolsista! Tem o pagamento facilitado. ");
	}


	public String detalsBolsa() {
		return ("\nbolsa = " + bolsa);
	}
	

	
}
