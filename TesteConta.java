package Projs;

public class TesteConta 
{

	public static void main(String[] args) 
	{
		Conta cc = new Conta();

		cc.temConta("Não");
		cc.setNome("Fabiano");
		cc.setNum(564735);
		cc.setAgencia(36);
	    cc.setTip("CC");
	    cc.abrirConta();
	    cc.status();
	    cc.pagarMensal();
	    cc.setDeposito(500.0);
	    cc.setSaque(523.00);
		cc.fecharConta();
		
		System.out.println("\n-------------------------");
		
		Conta cp = new Conta();
		
		cp.temConta("Sim");
		cp.setNome("Yolanda");
		cp.setNum(433735);
		cp.setAgencia(36);
		cp.setTip("CP");
		cp.abrirConta();
		cp.status();
		cp.pagarMensal();
		cp.setDeposito(1200.0);
		cp.setSaque(450.00);
		cp.fecharConta();
		
		
	}

}
