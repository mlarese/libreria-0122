package it.epicode.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import it.epicode.model.Categoria;

@Path("/categorie")
public class CategorieREST {
	static List<Categoria> categorie = new ArrayList<Categoria>();
	
	
	// Azione, Giallo , Romantico , Guerra, Fantasy, Fantastico
	
	public CategorieREST() {
		// TODO Auto-generated constructor stub
	}

	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		
		return  Response.status(200).entity(categorie).build();
	}
	
	
	@GET
	@Path("/{letter}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllByFirstLetter(@PathParam("letter") String letter) {
		List<Categoria> risultato = new ArrayList<Categoria>();
		
		
		for(Categoria c: categorie) {
			if(c.getDescrizione().startsWith(letter)) {
				risultato.add(c);
			}
		}
		
		return Response.status(100).entity(risultato).build();
	}
	
	public Response getAllByFirstLetterStream(String letter) {
		
		List<Categoria> res = categorie
		.stream()
		.filter((categoria)->categoria.getDescrizione().startsWith(letter))
		.collect(Collectors.toList());
		
		return Response.status(200).entity(res).build();
		
	}
	
	// parametri il simbolo lambda l'operazione da eseguire
	// (categoria)->c.getDescrizione().startsWith(letter)
	/*
	 * 
	  	(categoria)->{
	  		return c.getDescrizione().startsWith(letter);
	  	}
	 * */
	public Categoria get(int id) {
	
			return null;
	}
	
	public void update(int id, Categoria c) {
		
	}
	
	public void insert(Categoria c) {
		
	}
	
	public void delete(Categoria c) {
		
	}
	
	
	public static void stampaCategoria(Categoria c) {
		System.out.println("Categoria trovata " + c.getDescrizione());
		
	}
	public static void main(String[] args) {
		Categoria a = new Categoria(1,"Azione");
		Categoria b = new Categoria(2,"Fantasy");
		Categoria c = new Categoria(3,"Fantastico");
		Categoria d= new Categoria(4,"Romantico");
		Categoria e = new Categoria(5,"Guerra");
		Categoria f = new Categoria(6,"Giallo");
		
		categorie.add(a);
		categorie.add(b);
		categorie.add(c);
		categorie.add(d);
		categorie.add(e);
		categorie.add(f);
		
		
		List<Categoria> res = categorie
				.stream()
				.filter((cat)->cat.getDescrizione().startsWith("A"))
				.collect(Collectors.toList());
		
		for(Categoria tmp: res) {
			System.out.println(tmp.getDescrizione());
		}
		
		System.out.println("---------------------");
		categorie
				.stream()
				.filter((cat)->cat.getDescrizione().startsWith("F"))
				.forEach(CategorieREST::stampaCategoria);
		
		
		System.out.println("======================");
		categorie.stream()
		.forEach((cat1)-> {
			System.out.println("-------");
			System.out.println(cat1.getDescrizione());
			System.out.println("-------");
		});
		
		
		System.out.println("======================");
		categorie.stream()
		.map((cat2)->cat2.getDescrizione().toUpperCase())
		.filter(desc->desc.startsWith("F"))
		.forEach(System.out::println);
		;
		
		
	}
	
}
