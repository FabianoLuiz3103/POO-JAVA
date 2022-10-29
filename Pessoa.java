package FinalProj;

public abstract class Pessoa
{
    private String nome;
    private String sexo;
    private int idade;
    private float experiencia;
    
	public Pessoa(String nome, String sexo, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.experiencia = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}
    
	public void ganharExp()
	{
		
		
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", experiencia=" + experiencia + "]";
	}
	
	
    
}
