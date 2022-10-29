package HERANÇA;

public class Funcionario extends Pessoa
{   
	private String setor;
	private boolean trabalhando;
   
	public Funcionario(String nome, String sexo, int idade, boolean trabalhando, String setor) {
		super(nome, sexo, idade);
		this.setSetor(setor);
		this.setTrabalhando(trabalhando);
		// TODO Auto-generated constructor stub
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	public void mudarTrabalho(String str)
	{
		if(this.isTrabalhando() == true)
		{
			this.setSetor(str);
			System.out.println(getSetor());
		}
		else
		{
			System.out.println(getSetor());
		}
	}
}
