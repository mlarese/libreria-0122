package it.epicode.model;

public class CasaEditrice {
	private int id;
	public CasaEditrice(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private String nome;
	public CasaEditrice() {
		// TODO Auto-generated constructor stub
	}

}
