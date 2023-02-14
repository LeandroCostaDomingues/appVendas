package com.com.LeandroCosta.appVendas.domain;

import javax.persistence.Entity;

import com.com.LeandroCosta.appVendas.domain.enuns.EstadoPagamento;
@Entity
public class PagamentoComCartao extends Pagamento {
	
	private static final long serialVersionUID = 1L;
	private Integer numeroDeParcelas;

	public PagamentoComCartao() {

	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
		// TODO Auto-generated constructor stub
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

}
