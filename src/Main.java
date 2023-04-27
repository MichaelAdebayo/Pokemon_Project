import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Scanner asking for the users name
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello Welcome to the Pokemon Trainer Game!");
        System.out.println("Enter your name to get started ! ");
        String userName = userInput.nextLine();

       // Scanner asking for the users pokemon type
        System.out.println( "Hey!"+ " " + userName +" "+ "Please Select a Pokemon Type");
        System.out.println("1 - WATER, 2 - EARTH, 3 - FIRE, 4 - AIR");
        int pokemonType = Integer.parseInt(userInput.nextLine());
        Pokemon userPokemon = new Pokemon(pokemonType);



    //Switch statement to let the user know which type of pokemon type they selected
        switch (pokemonType) {
            case 1:
                System.out.println("Great you selected a WATER type Pokemon ");
                break;
            case 2:
                System.out.println("Great you selected a EARTH type Pokemon ");
                break;
            case 3:
                System.out.println("Great you selected a FIRE type Pokemon ");
                break;
            case 4:
                System.out.println("Great you selected a AIR type Pokemon ");
                break;
        }
    }
}