package FinalProj;

public class YouTube 
{

	public static void main(String[] args) 
	{ 
		Video[] V = new Video[2];
		
		V[0] = new Video("Vídeo 1");
		
		Gafanhoto[] gf = new Gafanhoto[2];
		
        System.out.println(V[0].toString());
        
        Visualizacao vs = new Visualizacao();
        
        vs.verFilme(gf[0], V[0]);
	}

}
