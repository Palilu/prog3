package arceusTeamBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pokedex {

    private List<Pokemon> pokemons = new ArrayList<>();

    public Pokedex() {
        pokemons.add(new Pokemon("Decidueye", PokemonType.GRASS, PokemonType.FIGHTING));
        pokemons.add(new Pokemon("Typloison", PokemonType.FIRE, PokemonType.GHOST));
        pokemons.add(new Pokemon("Samurott", PokemonType.WATER, PokemonType.DARK));
        pokemons.add(new Pokemon("Staraptor", PokemonType.NORMAL, PokemonType.FLYING));
        //pokemons.add(new Pokemon("Beautifly", PokemonType.BUG, PokemonType.FLYING));
        pokemons.add(new Pokemon("Dustox", PokemonType.BUG, PokemonType.POISON));
        pokemons.add(new Pokemon("Crobat", PokemonType.POISON, PokemonType.FLYING));
        //pokemons.add(new Pokemon("Mothim", PokemonType.BUG, PokemonType.FLYING));
        //pokemons.add(new Pokemon("Golem", PokemonType.ROCK, PokemonType.GROUND));
        pokemons.add(new Pokemon("Wyrdeer", PokemonType.NORMAL, PokemonType.PSYCHIC));
        pokemons.add(new Pokemon("Parasect", PokemonType.BUG, PokemonType.GRASS));
        pokemons.add(new Pokemon("Infernape", PokemonType.FIRE, PokemonType.FIGHTING));
        //pokemons.add(new Pokemon("Vespiqueen", PokemonType.BUG, PokemonType.FLYING));
        pokemons.add(new Pokemon("Scyther", PokemonType.BUG, PokemonType.FLYING));
        pokemons.add(new Pokemon("Kleavor", PokemonType.BUG, PokemonType.ROCK));
        pokemons.add(new Pokemon("Scizor", PokemonType.BUG, PokemonType.STEEL));
        pokemons.add(new Pokemon("Heracross", PokemonType.BUG, PokemonType.FIGHTING));
        //pokemons.add(new Pokemon("Mr. Mime", PokemonType.PSYCHIC, PokemonType.FAIRY));
        pokemons.add(new Pokemon("Gyarados", PokemonType.WATER, PokemonType.FLYING));
        pokemons.add(new Pokemon("Gastrodon", PokemonType.WATER, PokemonType.GROUND));
        pokemons.add(new Pokemon("Overqwill", PokemonType.DARK, PokemonType.POISON));
        pokemons.add(new Pokemon("Roserade", PokemonType.GRASS, PokemonType.POISON));
        //pokemons.add(new Pokemon("Lilligant", PokemonType.GRASS, PokemonType.FIGHTING));
        //pokemons.add(new Pokemon("Whiscash", PokemonType.WATER, PokemonType.GROUND));
        pokemons.add(new Pokemon("Toxicroak", PokemonType.POISON, PokemonType.FIGHTING));
        pokemons.add(new Pokemon("Gardevoir", PokemonType.PSYCHIC, PokemonType.FAIRY));
        pokemons.add(new Pokemon("Gallade", PokemonType.PSYCHIC, PokemonType.FIGHTING));
        //pokemons.add(new Pokemon("Yanmega", PokemonType.BUG, PokemonType.FLYING));
        //pokemons.add(new Pokemon("Skuntank", PokemonType.POISON, PokemonType.DARK));
        pokemons.add(new Pokemon("Ursaluna", PokemonType.NORMAL, PokemonType.GROUND));
        pokemons.add(new Pokemon("Goodra", PokemonType.DRAGON, PokemonType.STEEL));
        //pokemons.add(new Pokemon("Onix", PokemonType.ROCK, PokemonType.GROUND));
        pokemons.add(new Pokemon("Steelix", PokemonType.STEEL, PokemonType.GROUND));
        pokemons.add(new Pokemon("Rhyperior", PokemonType.GROUND, PokemonType.ROCK));
        pokemons.add(new Pokemon("Togekiss", PokemonType.FAIRY, PokemonType.FLYING));
        pokemons.add(new Pokemon("Torterra", PokemonType.GRASS, PokemonType.GROUND));
        pokemons.add(new Pokemon("Gengar", PokemonType.GHOST, PokemonType.POISON));
        pokemons.add(new Pokemon("Spiritomb", PokemonType.GHOST, PokemonType.DARK));
        pokemons.add(new Pokemon("Honchkrow", PokemonType.DARK, PokemonType.FLYING));
        pokemons.add(new Pokemon("Walrein", PokemonType.ICE, PokemonType.WATER));
        //pokemons.add(new Pokemon("Drapion", PokemonType.POISON, PokemonType.DARK));
        pokemons.add(new Pokemon("Arcanine", PokemonType.FIRE, PokemonType.ROCK));
        //pokemons.add(new Pokemon("Chatot", PokemonType.NORMAL, PokemonType.FLYING));
        pokemons.add(new Pokemon("Empoleon", PokemonType.WATER, PokemonType.STEEL));
        //pokemons.add(new Pokemon("Mantine", PokemonType.WATER, PokemonType.FLYING));
        pokemons.add(new Pokemon("Basculegion", PokemonType.WATER, PokemonType.GHOST));
        pokemons.add(new Pokemon("Ninetales", PokemonType.ICE, PokemonType.FAIRY));
        pokemons.add(new Pokemon("Tentacruel", PokemonType.WATER, PokemonType.POISON));
        pokemons.add(new Pokemon("Magnezone", PokemonType.ELECTRIC, PokemonType.STEEL));
        pokemons.add(new Pokemon("Bronzong", PokemonType.STEEL, PokemonType.PSYCHIC));
        pokemons.add(new Pokemon("Gliscor", PokemonType.GROUND, PokemonType.FLYING));
        pokemons.add(new Pokemon("Garchomp", PokemonType.DRAGON, PokemonType.GROUND));
        pokemons.add(new Pokemon("Probopass", PokemonType.ROCK, PokemonType.STEEL));
        pokemons.add(new Pokemon("Electrode", PokemonType.ELECTRIC, PokemonType.GRASS));
        //pokemons.add(new Pokemon("Sneasler", PokemonType.POISON, PokemonType.FIGHTING));
        pokemons.add(new Pokemon("Weavile", PokemonType.DARK, PokemonType.ICE));
        pokemons.add(new Pokemon("Frostlass", PokemonType.ICE, PokemonType.FLYING));
        //pokemons.add(new Pokemon("Bastiodon", PokemonType.ROCK, PokemonType.STEEL));
        pokemons.add(new Pokemon("Mamoswine", PokemonType.ICE, PokemonType.GROUND));
        pokemons.add(new Pokemon("Avalugg", PokemonType.ICE, PokemonType.ROCK));
        pokemons.add(new Pokemon("Abomasnow", PokemonType.ICE, PokemonType.GRASS));
        pokemons.add(new Pokemon("Zoroark", PokemonType.NORMAL, PokemonType.GHOST));
        pokemons.add(new Pokemon("Braviary", PokemonType.PSYCHIC, PokemonType.FLYING));
        pokemons.add(new Pokemon("Lucario", PokemonType.FIGHTING, PokemonType.STEEL));
        //pokemons.add(new Pokemon("Heatran", PokemonType.FIRE, PokemonType.STEEL));
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void getTeam(List<Pokemon> team, int typeIndex) {
        if (typeIndex >= 8) {
            System.out.println(typeIndex + " " + team);
        }

        if (typeIndex == 9) {
            System.out.println(typeIndex + " " + team);
            return;
        }

        List<Pokemon> typePokemons = pokemons.stream()
                .filter(pokemon -> pokemon.isType(PokemonType.values()[typeIndex]))
                .filter(pokemon -> pokemon.fits(team))
                .collect(Collectors.toList());

        if (typePokemons.isEmpty()) {
            return;
        } else {
            for (Pokemon candidate: typePokemons) {
                List<Pokemon> newTeam = new ArrayList<>(team);
                newTeam.add(candidate);
                getTeam(newTeam, typeIndex + 1);
            }
        }
    }
}
