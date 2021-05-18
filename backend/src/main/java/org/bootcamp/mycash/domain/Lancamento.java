package org.bootcamp.mycash.domain;

import java.time.LocalDate;

public class Lancamento {

	private String descricao;
	private Double valor;
	private LocalDate data;
	private LancamentoTipo tipo;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LancamentoTipo getTipo() {
		return tipo;
	}

	public void setTipo(LancamentoTipo tipo) {
		this.tipo = tipo;
	}

}
