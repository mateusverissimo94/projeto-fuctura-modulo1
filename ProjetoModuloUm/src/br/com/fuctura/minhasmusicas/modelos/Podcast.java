package br.com.fuctura.minhasmusicas.modelos;

public class Podcast extends Audio {
	private String apresentador;
	private String descricao;

	public Podcast(String titulo, String apresentador, String descricao) {
		super(titulo);
		this.apresentador = apresentador;
		this.descricao = descricao;
	}

	public String getApresentador() {
		return apresentador;
	}

	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public double getClassificacao() {
		if(this.getCurtir()) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "\nTitulo: " + this.getTitulo() + "\nApresentador(es): " + this.apresentador + "\nDescrição: " + this.descricao + "\n\n";
	}

}
