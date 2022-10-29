package Projs;

public class Lutadores 
{
     private String nome;
     private String nacionalidade;
     private int idade;
     private float altura;
     private float peso;
     private String categoria;
     private int vitorias;
     private int derrotas;
     private int empates;
     
     public Lutadores(String n, String nac,int i, float alt, float p,
    		          int vit,
    		          int der,
    		          int emp)
     {
    	 //Atributos recebendo parâmetros;
    	 
    	 this.setNome(n);
    	 this.setNacionalidade(nac);
    	 this.setIdade(i);
    	 this.setAltura(alt);
    	 this.setPeso(p);
    	 this.setVitorias(vit);
    	 this.setEmpates(emp);
    	 this.setDerrotas(der);
    	 
     }


	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nac) {
		this.nacionalidade = nac;
	}
	

	public int getIdade() {
		return idade;
	}


	public void setIdade(int i) {
		this.idade = i;
	}


	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float alt) {
		this.altura = alt;
	}
	public float getPeso() {
		return peso;
	}

	public void setPeso(float p) {
		this.peso = p;
    	
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.getPeso() < 52.0)
		{
			this.categoria = "Peso inválido!\nVocê está abaixo do peso!";
		}
		else
		 if(this.getPeso() <= 80)
    	 {
    		 this.categoria = "Leve";
    	 }
		 else
    	 if(this.getPeso() <= 100)
    	 {
    		 this.categoria = "Médio";
    	 }
    	 else
    	 if(this.getPeso() <= 130)
    	 {
    		 this.categoria = "Pesado";
    	 }
    	 else
    	 {
    		 this.categoria = "Peso inválido!\nVocê está acima do peso!"
    				 ;
    	 }
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vit) {
		this.vitorias = vit;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int der) {
		this.derrotas = der;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int emp) {
		this.empates = emp;
	}
     
     public void apresentarLutador()
     {
    	 System.out.println("------------------------------------------");
    	 System.out.println("Nome: " + getNome());
    	 System.out.println("Nacionalidade: " + getNacionalidade());
    	 System.out.println("Altura: " + getAltura());
    	 System.out.println("Idade: " + getIdade());
    	 System.out.println("Peso: " + getPeso());
    	 System.out.println("Categoria: " + getCategoria());
    	 System.out.println("Vitórias: " + getVitorias());
    	 System.out.println("Empates: " + getEmpates());
    	 System.out.println("Derrotas: " + getDerrotas());
    	 
     }
     public void status()
     {
    	 System.out.println("------------------------------"
    	 		+ "");
    	 System.out.println("Nome: " + getNome());
    	 System.out.println("Vitórias: " + getVitorias());
    	 System.out.println("Empates: " + getEmpates());
    	 System.out.println("Derrotas: " + getDerrotas());

    	 
     }
     public void ganharLuta()
     {
    	 this.setVitorias(this.getVitorias() + 1);
    	 System.out.println("PARABÉNS, VOCÊ GANHOU! ");
    	 System.out.println("Vitórias: " + getVitorias());
    	 
     }
     public void perderLuta()
     {
    	 this.setDerrotas(this.getDerrotas() + 1);
    	 
     }
     public void empatarLuta()
     {
    	 this.setEmpates(this.getEmpates() + 1);
     }
     
}
