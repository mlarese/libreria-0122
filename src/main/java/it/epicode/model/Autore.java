package it.epicode.model;

public class Autore {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String nome;
	private String cognome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Autore() {
		// TODO Auto-generated constructor stub
	}

	public Autore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

}
