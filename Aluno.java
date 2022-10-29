package HERANÇA;

public class Aluno extends Pessoa
{
     private String matri;
     private String curso;
	
	public Aluno(String nome, String sexo, int idade, String matri, String curso) {
		super(nome, sexo, idade);
		this.setMatri(matri);
		this.setCurso(curso);
		// TODO Auto-generated constructor stub
	}

	public String getMatri() {
		return matri;
	}

	public void setMatri(String matri) {
		this.matri = matri;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void cancelarMatri()
	{
		
		System.out.println("MATRÍCULA CANCELADA!");
	}
	
	public void pagarMatri()
	{
		System.out.println("Paga matrícula do(a) aluno " + this.getNome());
	}


	public String detalsAluno() {
		return ("\nmatri = " + matri + ",\ncurso = " + curso);
	}
	
	

}
