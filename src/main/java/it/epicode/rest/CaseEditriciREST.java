package it.epicode.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.epicode.model.Autore;
import it.epicode.model.CasaEditrice;


@Path("/case_editrici")
public class CaseEditriciREST {

	public CaseEditriciREST() {
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CasaEditrice> getAll() {
		
		
		return null;
	}
	
	
	@GET
	@Path("/per_nome/{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CasaEditrice> getAllByname(@PathParam("nome") String cognome) {
		
		
		return null;
	}
	
	@GET
	@Path("/ordinato_per_nome")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CasaEditrice> getAllSortedByName() {
		
		
		return null;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public CasaEditrice get(@PathParam("id") int id) {
		
		
		return null;
	}
	
	@PUT
	@Path("/{id_casa}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CasaEditrice update( @PathParam("id_casa") int id, CasaEditrice c ) {
		// id = 100 ossia il parametro dell'url
		// c = json passato con la chiamata da postman
		
		return null;
	}
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(Autore a) {
		
	}
	
	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id")  int id) {
		
	}
}
