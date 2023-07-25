import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Pokemon {
    private String pokemonName;
    private int level = 1;
    private int health = 100;

    private int pokemonElement;
    private Element[] weaknesses;

    private Random random = new Random();

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
        //this.health = health;
        switch (pokemonElement) {
            case 1:
                this.pokemonName = "Bulb";
                break;
            case 2:
                this.pokemonName = "Toph";
                break;
            case 3:
                this.pokemonName = "Char";
                break;
            case 4:
                this.pokemonName = "Aang";
                break;
        }
//System.out.println("Your Pokemon name is : "+ pokemonName);
        }

    public String getElementTypeName() {
        return elementMap.getOrDefault(pokemonElement, "UNKNOWN");
    }

    public int getHealth(){
        return health ;
    }

    //Methods that will control the logic of how the pokemon will attack
    //As well as the properties of each attack
    public void lightAttack(Pokemon target) {
        int damage = calculateAttackDamage(10, target);
        double missAttack= 0.05;
        performAttack(target, damage, missAttack);
    }

    public void mediumAttack(Pokemon target) {
        int damage = calculateAttackDamage(20, target);
        double missAttack= 0.1;
        performAttack(target, damage, missAttack);
    }

    public void heavyAttack(Pokemon target) {
        int damage = calculateAttackDamage(30, target);
        double missAttack= 0.2;
        performAttack(target, damage, missAttack);
    }

    public void specialAttack(Pokemon target) {
        int damage = calculateAttackDamage(40,  target);
        double missAttack= 0.4;
        performAttack(target, damage, missAttack);
    }

    private void performAttack(Pokemon target, int damage, double missAttack) {
        //The logic to show how an attack is performed, there is a chance to miss based on attack
        if (random.nextDouble()> missAttack) {
            target.takeDamage(damage);
            System.out.println("Attack hits! " + damage + " damage dealt.");
        } else {
            System.out.println("Attack misses!");
        }
    }


    //Will reduce the health of the Pokemon based on what type of attack was used
    private void takeDamage(int damage) {

        this.health = this.health - damage;
    }

    //Should add 10 health to the pokemon
    public int giveHealth() {

        this.health = this.health + 10 ;

        return health;

    }

    private int calculateAttackDamage(int baseDamage, Pokemon target) {
        // Calculate attack damage based on level, type advantages, and other factors

        //Elemental advantage for a WATER type attacking a FIRE type
        if (pokemonElement == 1 && target.getElementTypeName().equals("FIRE")){
            baseDamage *=2;
            System.out.println("IT DID 2x DAMAGE");
        }
        //Elemental disadvantage for a WATER type attacking a AIR type
        else if (pokemonElement == 1 && target.getElementTypeName().equals("AIR"))
        {
            baseDamage *=0.5;
            System.out.println("IT DID 0.5x DAMAGE");

        }


        //Elemental advantage for a EARTH type attacking a AIR type
        if (pokemonElement == 2 && target.getElementTypeName().equals("AIR")){
            baseDamage *=2;
            System.out.println("IT DID 2x DAMAGE");
        }
        //Elemental disadvantage for a EARTH type attacking a FIRE type
        else if (pokemonElement == 2 && target.getElementTypeName().equals("FIRE"))
        {
            baseDamage *=0.5;
            System.out.println("IT DID 0.5x DAMAGE");

        }

        //Elemental advantage for a FIRE type attacking a EARTH type
        if (pokemonElement == 3 && target.getElementTypeName().equals("EARTH")){
            baseDamage *=2;
            System.out.println("IT DID 2x DAMAGE");
        }
        //Elemental disadvantage for a FIRE type attacking a WATER type
        else if (pokemonElement == 3 && target.getElementTypeName().equals("WATER"))
        {
            baseDamage *=0.5;
            System.out.println("IT DID 0.5x DAMAGE");

        }

        //Elemental advantage for a AIR type attacking a WATER type
        if (pokemonElement == 4 && target.getElementTypeName().equals("WATER")){
            baseDamage *=2;
            System.out.println("IT DID 2x DAMAGE");
        }
        //Elemental disadvantage for a AIR type attacking a EARTH type
        else if (pokemonElement == 4 && target.getElementTypeName().equals("EARTH"))
        {
            baseDamage *=0.5;
            System.out.println("IT DID 0.5x DAMAGE");

        }

        // Return the calculated damage value
        return baseDamage;
    }



    }

