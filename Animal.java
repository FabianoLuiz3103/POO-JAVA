package POLI;

public abstract class Animal 
{
   private double peso;
   private int idade;
   private int membros;
   
   
   
   public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
	System.out.println(getPeso());
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
	System.out.println(getIdade());
}
public int getMembros() {
	return membros;
}
public void setMembros(int membros) {
	this.membros = membros;
	System.out.println(getMembros());
}
public abstract void locomover();
   public abstract void alimentar();
   public abstract void som();
   
   
	
}
