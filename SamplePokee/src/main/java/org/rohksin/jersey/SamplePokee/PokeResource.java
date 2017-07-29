package org.rohksin.jersey.SamplePokee;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Pokemon")
public class PokeResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pokemon> getAllPokemon()
	{
		PokemonService pokemonService = new PokemonService();
		return pokemonService.getAllPokemon();
	}
	
	
	@GET
	@Path("/{pokemonId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Pokemon getPokemon(@PathParam("pokemonId") int pokemonId)
	{
		PokemonService pokemonService = new PokemonService();
		try {
		return pokemonService.getPokemon(pokemonId);
		}
		catch(IndexOutOfBoundsException e)
		{
			return null;
		}
	}
}
