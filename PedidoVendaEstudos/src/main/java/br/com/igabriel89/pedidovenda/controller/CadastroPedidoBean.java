package br.com.igabriel89.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.igabriel89.pedidovenda.service.NegocioException;

@ManagedBean
@RequestScoped
public class CadastroPedidoBean {
	private List<Integer> itens;

	public CadastroPedidoBean() {
		this.itens = new ArrayList<Integer>();
		this.itens.add(1);
	}
	
	public void salvar() {
		System.out.println("Teste do método Salvar");
		throw new NegocioException("Pedido não pode ser salvo, pois ainda não foi implementado!!!");
	}
	
	public List<Integer> getItens() {
		return itens;
	}
	


}
