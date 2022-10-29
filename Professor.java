package HERANÇA;

public class Professor extends Pessoa
{
    private double salario;
    private String especialidade;
	
	public Professor(String nome, String sexo, int idade, double salario, String especialidade) {
		super(nome, sexo, idade);
		this.setSalario(salario);
		this.setEspecialidade(especialidade);
		// TODO Auto-generated constructor stub
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void receberAumento(double s)
	{
		this.setSalario(getSalario() + s);
		System.out.println(getSalario());
	}

}

