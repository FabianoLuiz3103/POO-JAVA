package FinalProj;

public class Gafanhoto extends Pessoa 
{
    private String login;
    private int totAssistido;
	
	public Gafanhoto(String nome, String sexo, int idade, String login) {
		super(nome, sexo, idade);
		this.login = login;
		this.totAssistido = 0;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	public void viuMaisUm()
	{
	    this.setTotAssistido(getTotAssistido() + 1);
	}

	@Override
	public String toString() {
		return "Gafanhoto["+super.toString()+"login=" + login + ", totAssistido=" + totAssistido + "]";
	}
	
	
}