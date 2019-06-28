package br.com.igabriel89.pedidovenda.service;

public class NegocioException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegocioException(String mensagem) {
		super(mensagem);
		System.out.println("Construtor NegocioException: " + mensagem);
	}
}
