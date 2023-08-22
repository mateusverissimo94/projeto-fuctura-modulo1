package br.com.fuctura.minhasmusicas.modelos;

public class StringVaziaException extends Exception{
	public StringVaziaException (String message) {
		super(message);
	}
	
	public static void VerificaString(String texto) throws StringVaziaException {
		if(texto.isBlank() || texto.isEmpty()) {
			throw new StringVaziaException("Campo vazio!");
		}
	}
}
