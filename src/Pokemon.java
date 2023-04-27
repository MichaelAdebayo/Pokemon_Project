public class Pokemon {
    private int level = 1;
    private int health = 100;

    private int lightAttack = 10;
    private int mediumAttack = 20;
    private int heavyAttack = 30;
    private int specialAttack = 40;

    private int pokemonElement;
    private Element[] weaknesses;

    public Pokemon(int pokemonElement) {
        this.pokemonElement = pokemonElement;
    }

}

