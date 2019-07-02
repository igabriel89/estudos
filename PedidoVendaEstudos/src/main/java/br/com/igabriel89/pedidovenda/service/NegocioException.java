package br.com.igabriel89.pedidovenda.service;

public class NegocioException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NegocioException(String msg) {
		super(msg);
		System.out.println("Clase NegocioExc");
		System.out.println("------------------------------------");
	}
	
}
