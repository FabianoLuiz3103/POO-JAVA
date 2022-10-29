package FinalProj;

public class Video implements AcoesVideos
{

	private String titulo;
	private int avaliaçao;
	private int visu;
	private int curt;
	private boolean reproduzindo;
	
	
	
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliaçao = 1;
		this.visu = 0;
		this.curt = 0;
		this.reproduzindo = false;
	}

	@Override
	public void play() {
		
		this.setReproduzindo(true);
		System.out.println("O vídeo vai começar a ser reproduzido!");
	}

	@Override
	public void pause() {
		
		this.setReproduzindo(false);
		System.out.println("O vídeo foi pausado! ");
		
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

	public int getAvaliaçao() {
		return avaliaçao;
	}

	public void setAvaliaçao(int avaliaçao) {
		this.avaliaçao = avaliaçao;
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
		return "Video [titulo=" + titulo + ", avaliaçao=" + avaliaçao + ", visu=" + visu + ", curt=" + curt
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	
	

}
