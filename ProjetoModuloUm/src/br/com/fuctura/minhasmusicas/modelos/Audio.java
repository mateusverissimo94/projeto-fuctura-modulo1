package br.com.fuctura.minhasmusicas.modelos;


public class Audio {
	private String titulo;
	private int totalReproducoes;
	private boolean curtir;
	private double classificacao;

	public Audio(String titulo) {
		this.titulo = titulo;
		this.curtir = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTotalReproducoes() {
		return totalReproducoes;
	}

	public boolean getCurtir() {
		return curtir;
	}

	public double getClassificacao() {
		return classificacao;
	}

	public void curte() {
		this.curtir = true;
	}

	public void reproduz(int numero) {
		this.totalReproducoes = numero;
	}
	
}
