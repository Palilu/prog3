package arceusTeamBuilder;

import java.util.List;

public class Pokemon {
    private String name;
    private PokemonType type1;
    private PokemonType type2;

    public Pokemon(String name, PokemonType type1, PokemonType type2) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
    }

    public String getTypeKey() {
        var types = getTypes();
        return types.get(0) + "-" + types.get(1);
    }

    public List<PokemonType> getTypes() {
        return List.of(type1, type2).stream().sorted().toList();
    }

    public boolean isType(PokemonType type) {
        return type1 == type || type2 == type;
    }

    public boolean fits(List<Pokemon> team) {
        for (Pokemon pokemon: team) {
            if (this.isType(pokemon.getType1()) || this.isType(pokemon.getType2())) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public PokemonType getType1() {
        return type1;
    }

    public PokemonType getType2() {
        return type2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType1(PokemonType type1) {
        this.type1 = type1;
    }

    public void setType2(PokemonType type2) {
        this.type2 = type2;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type1=" + type1 +
                ", type2=" + type2 +
                '}';
    }
}
