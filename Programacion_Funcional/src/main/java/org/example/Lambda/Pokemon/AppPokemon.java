package org.example.Lambda.Pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppPokemon {

    public static void main(String[] args) {

        Pokedex poke1 = new Pokedex("Squirtle", 5);
        Pokedex poke2 = new Pokedex("Charmander", 2);

        Pokemon squirtle = (nivel, pokedex) ->  {
            System.out.println("EMPIEZA EL COMBATE");
            System.out.println("Lucha contra " + pokedex.getPokemon());
        };

        squirtle.atacar(8, poke1);

        List<Pokedex> listaPokemons = new ArrayList<>();
        listaPokemons.add(poke1);
        listaPokemons.add(poke2);
        listaPokemons.add(new Pokedex("Bulbasur", 15));

        // Tres forma de ordenar 1. Lambdas 2 y 3 Comparator comparing uno sobre la lista y otro con collections
        Collections.sort(listaPokemons, (a,b) -> a.getEntrenadores().compareTo(b.getEntrenadores()));
        Collections.sort(listaPokemons, Comparator.comparing(Pokedex::getEntrenadores));
        listaPokemons.sort(Comparator.comparing(Pokedex::getEntrenadores));

        // De esta forma primero compara por numero de entrenadores y despues desempata comparando por el nombre.
        listaPokemons.sort(Comparator.comparing(Pokedex::getEntrenadores).thenComparing(Pokedex::getPokemon));
        System.out.println(listaPokemons);


    }

}
