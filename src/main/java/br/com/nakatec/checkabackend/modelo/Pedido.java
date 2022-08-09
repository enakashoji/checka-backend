package br.com.nakatec.checkabackend.modelo;

import java.time.LocalDateTime;

public class Pedido {

	private Long numero;
	private Produto produto;
	private String observacao;
	private Long quantidade;
	private Situacao situacao;
	private LocalDateTime data;
	public Pedido(Long numero, Produto produto, String observacao, Long quantidade, Situacao situacao,
			LocalDateTime data) {
		super();
		this.numero = numero;
		this.produto = produto;
		this.observacao = observacao;
		this.quantidade = quantidade;
		this.situacao = situacao;
		this.data = data;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
}
