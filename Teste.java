package HERANÇA;

public class Teste {

	public static void main(String[] args)
	{
		
		Aluno p1 = new Aluno("Fabiano", "M", 18, "RM321", "SILG");
		Bolsista b1 = new Bolsista("Manu", "F", 18, "RM444", "MKT");

		Professor p2 = new Professor("Robeto", "M", 45, 3000, "Física");
		
		Funcionario p3 = new Funcionario("Fatíma", "F", 40, false, "estoque");
		


		p1.fazerAniver();
		
		System.out.println(b1.toString() + b1.detalsAluno() + b1.detalsBolsa());
	}
	
	

}
