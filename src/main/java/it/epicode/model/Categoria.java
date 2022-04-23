package it.epicode.model;

public class Categoria {
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", descrizione=" + descrizione + "]";
	}

	private int id;
	private String descrizione;
	
	public Categoria(int id, String descrizione) {
		this.id = id;
		this.descrizione = descrizione;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Categoria() {
		// TODO Auto-generated constructor stub
	}

}
