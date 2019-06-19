package br.com.igabriel89.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaProdutoBrean {

	private List<Integer> produtosFiltrados;

	public void PesquisaProdutoBean() {
		produtosFiltrados = new ArrayList<>();
		for(int i = 0; i < 50; i++) {
			produtosFiltrados.add(50);
		}
	}

	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}
	

}
