package org.rohksin.jersey.SamplePokee;


import java.util.ArrayList;
import java.util.List;

public class PokemonService {
	
	private PokeDataBase dataBase;
	
	public PokemonService()
	{
		dataBase = new PokeDataBase();;
	}
	
	
	public List<Pokemon> getAllPokemon()
	{
		return dataBase.allPokemon();
	}
	
	public Pokemon getPokemon(int id)
	{
		return dataBase.allPokemon().get(id);
	}
	
	

}
