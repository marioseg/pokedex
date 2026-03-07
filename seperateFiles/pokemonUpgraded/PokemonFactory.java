package pokemonUpgraded;

import pokemonUpgraded.pokemons.*;

public class PokemonFactory {

    public static Pokemon getPokemon(String name) {

        switch(name.toLowerCase()) {

            case "pikachu": return new Pikachu();
            case "raichu": return new Raichu();

            case "squirtle": return new Squirtle();
            case "wartortle": return new Wartortle();
            case "blastoise": return new Blastoise();

            case "charmander": return new Charmander();
            case "charmeleon": return new Charmeleon();
            case "charizard": return new Charizard();

            case "bulbasaur": return new Bulbasaur();
            case "ivysaur": return new Ivysaur();
            case "venusaur": return new Venusaur();

            case "caterpie": return new Caterpie();
            case "metapod": return new Metapod();
            case "butterfree": return new Butterfree();

            case "weedle": return new Weedle();
            case "kakuna": return new Kakuna();
            case "beedrill": return new Beedrill();

            case "pidgey": return new Pidgey();
            case "pidgeotto": return new Pidgeotto();
            case "pidgeot": return new Pidgeot();

            case "rattata": return new Rattata();
            case "raticate": return new Raticate();

            case "ekans": return new Ekans();
            case "arbok": return new Arbok();

            case "sandshrew": return new Sandshrew();
            case "sandslash": return new Sandslash();

            case "clefairy": return new Clefairy();
            case "clefable": return new Clefable();

            case "vulpix": return new Vulpix();
            case "ninetales": return new Ninetales();

            default:
                return null;
        }
    }
}