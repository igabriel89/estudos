package br.com.igabriel89.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.igabriel89.pedidovenda.service.NegocioException;

@Named
@RequestScoped
public class CadastroPedidoBean {
	
	private List<Integer> itens;

	public CadastroPedidoBean() {
		this.itens = new ArrayList<Integer>();
		this.itens.add(1);
	}
	
	public void salvar() {
		System.out.println("Clase PedidoBean");
		System.out.println("------------------------------------");
		throw new NegocioException("Pedido não pode ser salvo, pois ainda não foi implementado!!!");
	}
	
	public List<Integer> getItens() {
		return itens;
	}
	
}
