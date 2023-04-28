import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pokemon {
    private int level = 1;
    private int health = 100;

    private int lightAttack = 10;
    private int mediumAttack = 20;
    private int heavyAttack = 30;
    private int specialAttack = 40;

    public int  pokemonElement ;
    private Element[] weaknesses;

    //Will show what the pokemon is weak to
    public boolean weakTo;

    //Hash Map that has the different element Types that are associated with a number
    public static final Map<Integer, String> elementMap = new HashMap<>();
    static {
        elementMap.put(1, "WATER");
        elementMap.put(2, "EARTH");
        elementMap.put(3, "FIRE");
        elementMap.put(4, "AIR");
    }

    //Constructor that will allow me to call the fields of Pokemon Class
    public Pokemon(int pokemonElement) {
        this.pokemonElement = pokemonElement;

        if(pokemonElement == 1){
                System.out.println(elementMap.get(1));
            }

        if (pokemonElement == 3){

        }
        }

    public String getElementTypeName() {
        return elementMap.getOrDefault(pokemonElement, "UNKNOWN");
    }


    }

