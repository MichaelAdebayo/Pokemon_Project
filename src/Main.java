import java.util.Scanner;
import java.util.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Scanner asking for the users name
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello Welcome to the Pokemon Trainer Game!");
        System.out.println("Enter your name to get started ! ");
        String userName = userInput.nextLine();

        //Random number between 1 - 4
        Random random = new Random();
        int randomNumber = random.nextInt(4)+1;

       // Scanner asking for the users Pokémon type
        System.out.println( "Hey!"+ " " + userName +" "+ "Please Select a Pokemon Type");
        System.out.println("1 - WATER, 2 - EARTH, 3 - FIRE, 4 - AIR");
        int pokemonType = Integer.parseInt(userInput.nextLine());
        Pokemon userPokemon = new Pokemon(pokemonType);
        User name = new User(userName);



       // testPokemon.lightAttack(userPokemon);



    //Switch statement to let the user know which type of Pokémon type they selected
        switch (pokemonType) {
            case 1:
                System.out.println("Great you selected a WATER type Pokemon! ");
                break;
            case 2:
                System.out.println("Great you selected a EARTH type Pokemon! ");
                break;
            case 3:
                System.out.println("Great you selected a FIRE type Pokemon! ");
                break;
            case 4:
                System.out.println("Great you selected a AIR type Pokemon! ");
                break;
        }

        System.out.println();

        System.out.println("Are you ready for your first opponent?");
        String play = userInput.nextLine();
         if (play.equals("y") || play.equals("Y")) {
            System.out.println("Let's Begin");

            // This is just to test to make sure the functions are working correctly
             //The object will take the random number and give out a pokemon with a random element everytime
             Pokemon testPokemon = new Pokemon(randomNumber);
        } else if (play.equals("n") || play.equals("N")) {
            System.out.println("Bye");
        }



        //System.out.println(userPokemon.pokemonElement);
    }
}