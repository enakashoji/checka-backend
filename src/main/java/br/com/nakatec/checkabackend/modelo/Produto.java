package br.com.nakatec.checkabackend.modelo;

public class Produto {

	private Long id;
	private String nome;
	private String descricao;
	private UnidadeMedida metrica;
	private boolean perecivel;

	public Produto(Long id, String nome, String descricao, UnidadeMedida metrica, boolean perecivel) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.metrica = metrica;
		this.perecivel = perecivel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public UnidadeMedida getMetrica() {
		return metrica;
	}

	public void setMetrica(UnidadeMedida metrica) {
		this.metrica = metrica;
	}

	public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}
	
	
}
