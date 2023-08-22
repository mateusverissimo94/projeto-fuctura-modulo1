package br.com.fuctura.minhasmusicas.principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.fuctura.minhasmusicas.modelos.Audio;
import br.com.fuctura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.fuctura.minhasmusicas.modelos.Musica;
import br.com.fuctura.minhasmusicas.modelos.Podcast;
import br.com.fuctura.minhasmusicas.modelos.StringVaziaException;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner leDescricao = new Scanner(System.in);
		Scanner scanAlbum = new Scanner(System.in);
		Scanner scanTitulo = new Scanner(System.in);
		Scanner scanNome = new Scanner(System.in);
		Scanner scanGenero = new Scanner(System.in);
		MinhasPreferidas preferidas = new MinhasPreferidas();
		System.out.println("App Musicpop");
		int escutou = 0;
		String titulo, nome, genero, descricao, resposta, album;
		
		while(true) {
			System.out.println("É uma música ou um podcast:(M - música, P - podcast)");
			resposta = scan.next();
			
			if (resposta.toUpperCase().equals("M")) {
				
				System.out.println("Titulo da musica: ");
				titulo = scanTitulo.nextLine();
				
				System.out.println("Album da musica: ");
				album = scanAlbum.nextLine();
				
				System.out.println("Nome do cantor/grupo: ");
				nome = scanNome.nextLine();
				
				System.out.println("Genero musical: ");
				genero = scanGenero.nextLine();
				
				try {
					StringVaziaException.VerificaString(titulo);
					StringVaziaException.VerificaString(album);
					StringVaziaException.VerificaString(nome);
					StringVaziaException.VerificaString(genero);
				} catch(StringVaziaException e) {
					System.out.println("Exceção: " + e.getMessage());
					break;
				}
				
				try {
					System.out.println("Quantas vezes você ouviu essa musica: ");
					escutou = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Valor Inválido");
					break;
				}
				
				Musica musica = new Musica(titulo, album, nome, genero);
				musica.reproduz(escutou);
				preferidas.inclui(musica);
			} else if (resposta.toUpperCase().equals("P")) {
				System.out.println("Titulo do Podcast: ");
				titulo = scanTitulo.nextLine();
				
				System.out.println("Nome do Apresentador(es): ");
				nome = scanNome.nextLine();
				
				System.out.println("Descricao do podcast: ");
				descricao = leDescricao.nextLine();
				
				System.out.println("Você curtiu? (S ou N)");
				resposta = scan.next();
				
				try {
					StringVaziaException.VerificaString(titulo);
					StringVaziaException.VerificaString(nome);
					StringVaziaException.VerificaString(descricao);
				} catch(StringVaziaException e) {
					System.out.println("Exceção: " + e.getMessage());
					break;
				}
				
				Podcast podcast = new Podcast(titulo, nome, descricao);
				if (resposta.toUpperCase().equals("S")) {
					podcast.curte();
				}
				preferidas.inclui(podcast);
			} else {
				System.out.println("Valor inválido!");
				continue;
			}
			
			System.out.println("Deseja continur? S ou N");
			resposta = scan.next();
			
			if (resposta.toUpperCase().equals("N")) {
				break;
			}
		
		}
		
		System.out.println("Sua lista de Preferidas: ");
		for (Audio audio : preferidas.getPreferidas()) {
			if(audio instanceof Musica musica) {
				System.out.println(musica);
			} else if(audio instanceof Podcast podcast) {
				System.out.println(podcast);
			}
		}
	}
}