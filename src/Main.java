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
            case 1 -> System.out.println("Great you selected a WATER type Pokemon! ");
            case 2 -> System.out.println("Great you selected a EARTH type Pokemon! ");
            case 3 -> System.out.println("Great you selected a FIRE type Pokemon! ");
            case 4 -> System.out.println("Great you selected a AIR type Pokemon! ");
        }

        System.out.println();

        System.out.println("Are you ready for your first opponent?");
        String play = userInput.nextLine();
         if (play.equals("y") || play.equals("Y")) {
            System.out.println("Let's Begin");

            // This is just to test to make sure the functions are working correctly
             //The object will take the random number and give out a Pokémon with a random element everytime
             Pokemon testPokemon = new Pokemon(randomNumber);
             //Will let the user know if they have an advantage or disadvantage facing a certain Pokémon with an element type
             System.out.println("Your opponent has a " + testPokemon.getElementTypeName()+ " Type pokemon !");
            int pokemonHealth =  userPokemon.getHealth();


             while (pokemonHealth > 0 || testPokemon.getHealth() <= 0){
                 System.out.println("Pick an Attack: L , M , H , S ");
                 System.out.println("Opponents Heath : " + testPokemon.getHealth());
                 String attack = userInput.nextLine();

                 //Switch statement that will allow user to select what type of attack they want to perform
                 switch (attack) {
                     case "l" -> userPokemon.lightAttack(testPokemon);
                     case "m" -> userPokemon.mediumAttack(testPokemon);
                     case "h" -> userPokemon.heavyAttack(testPokemon);
                     case "s" -> userPokemon.specialAttack(testPokemon);
                 }
// Will have to add the logic to allow the computer to generate an attack too, will use another switch statement


             }

        }
         else if (play.equals("n") || play.equals("N")) {
            System.out.println("Bye");
        }



        //System.out.println(userPokemon.pokemonElement);
    }
}