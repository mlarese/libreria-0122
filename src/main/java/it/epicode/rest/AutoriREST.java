package it.epicode.rest;

import java.util.ArrayList;
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
import javax.ws.rs.core.Response;

import it.epicode.model.Autore;

@Path("/autori")
// http://localhost:8080/Libreria/rest/autori
public class AutoriREST {
	static List<Autore> autori=new ArrayList<Autore>();
	
	public AutoriREST() {
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response getAll() {
		 return Response.status(200).entity(autori).build();
	
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id_autore}")
	// http://localhost:8080/Libreria/rest/autori/7
	public Response get(@PathParam("id_autore") int id) {
		
		try {
			Autore a = autori.get(id-1);
			
			if(a!=null)
				return Response.status(200).entity(a).build();
			else
				return Response.status(404).entity("Autore non trovato").build();
		}catch(Exception e) {
			return Response.status(500).entity("Autore non trovato per un errore sul server").build();	
		}
		
		
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") int id, Autore a) {
		
		try {
			
			autori.add(id-1, a);
			return Response.status(200).entity("Autore modificato").build();
		} catch (Exception e) {
			return Response.status(500).entity("Autore non trovato, modifica non effettuata").build();
		}
		
		
		
	}
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response insert(Autore a) {
		
		autori.add(a);
		return Response.status(200).entity("Inserimento avvenuto").build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") int id) {
		
		try {
			
		}catch (Exception e) {
			
		}
		autori.remove(id-1);
		
		
		return Response.status(200).entity("Eliminazione avvenuta").build();
		
	}
	
}
