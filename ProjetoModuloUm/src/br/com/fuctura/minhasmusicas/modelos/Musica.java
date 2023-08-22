package br.com.fuctura.minhasmusicas.modelos;

public class Musica extends Audio {
	private String album;
	private String cantor;
	private String genero;

	public Musica(String titulo, String album,  String cantor, String genero) {
		super(titulo);
		this.cantor = cantor;
		this.genero = genero;
		this.album = album;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public double getClassificacao() {
		if (this.getTotalReproducoes() > 100) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "\nTitulo: " + this.getTitulo() + "\nAlbum: " + this.album +  "\nCantor: " + this.cantor + "\nGenero: " + this.genero + "\n\n";
	}

}
