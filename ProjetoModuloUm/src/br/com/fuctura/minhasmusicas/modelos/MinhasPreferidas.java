package br.com.fuctura.minhasmusicas.modelos;

import java.util.ArrayList;
import java.util.List;

public class MinhasPreferidas {
	private List<Audio> preferidas;

	public MinhasPreferidas() {
		this.preferidas = new ArrayList<>();
	}

	public List<Audio> getPreferidas() {
		return preferidas;
	}

	public void inclui(Audio audio) {
		if (audio.getClassificacao() == 1) {
			System.out.println(audio.getTitulo()
					+ " é considerado sucesso absoluto e preferido por todos, entrou na lista de preferidas!");
			this.preferidas.add(audio);
		} else {
			System.out.println(audio.getTitulo()
					+ " também é um dos que todo mundo está curtindo, mas não o suficiente para entrar na lista de preferidas!");
		}
	}
}
