package FinalProj;

public class Video implements AcoesVideos
{

	private String titulo;
	private int avalia�ao;
	private int visu;
	private int curt;
	private boolean reproduzindo;
	
	
	
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avalia�ao = 1;
		this.visu = 0;
		this.curt = 0;
		this.reproduzindo = false;
	}

	@Override
	public void play() {
		
		this.setReproduzindo(true);
		System.out.println("O v�deo vai come�ar a ser reproduzido!");
	}

	@Override
	public void pause() {
		
		this.setReproduzindo(false);
		System.out.println("O v�deo foi pausado! ");
		
	}

	@Override
	public void like() {
		
		this.setCurt(getCurt() + 1);
		System.out.println(getCurt());
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvalia�ao() {
		return avalia�ao;
	}

	public void setAvalia�ao(int avalia�ao) {
		this.avalia�ao = avalia�ao;
	}

	public int getVisu() {
		return visu;
	}

	public void setVisu(int visu) {
		this.visu = visu;
	}

	public int getCurt() {
		return curt;
	}

	public void setCurt(int curt) {
		this.curt = curt;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}


	public String toString() {
		return "Video [titulo=" + titulo + ", avalia�ao=" + avalia�ao + ", visu=" + visu + ", curt=" + curt
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	
	

}
