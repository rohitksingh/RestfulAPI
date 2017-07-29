package org.rohksin.jersey.SamplePokee;

import java.util.ArrayList;
import java.util.List;

public class PokeDataBase {
	
	public static List<Pokemon> pokemons;
	
	public PokeDataBase()
	{
		pokemons = new ArrayList<Pokemon>();
		pokemons.add(new Pokemon("Pikachu","thunderbolt"));
		pokemons.add(new Pokemon("Pigeot","Wing Atack"));
		pokemons.add(new Pokemon("Ratata","Bite"));
		pokemons.add(new Pokemon("Zubat","Wing Blade"));
	}
	
	public List<Pokemon> allPokemon()
	{
		return pokemons;
	}
	

}
