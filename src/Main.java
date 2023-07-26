import java.util.Scanner;
import java.util.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        // Scanner asking for the users name
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello Welcome to the Pokemon Trainer Game!");
        System.out.println("Enter your name to get started ! ");
        System.out.print("Your Name: ");
        String userName = userInput.nextLine();
        System.out.println();

       // Scanner asking for the users Pokémon type
        System.out.println( "Hey!"+ " " + userName +" "+ "Please Select a Pokemon Type");
        System.out.println("1 - WATER, 2 - EARTH, 3 - FIRE, 4 - AIR");
        int pokemonType = Integer.parseInt(userInput.nextLine());

        //a do-while loop to make sure the user selects a valid response
        if(pokemonType > 4 || pokemonType < 1) {
            do {
                System.out.println("Please Enter a valid Pokemon Type!");

                System.out.println("1 - WATER, 2 - EARTH, 3 - FIRE, 4 - AIR");
                pokemonType = Integer.parseInt(userInput.nextLine());
            }
            while (pokemonType > 4 || pokemonType < 1);
        }

        /*
        while (pokemonType > 4 || pokemonType < 1 ){
            System.out.println("Please Enter a valid Pokémon Type!");

            System.out.println("1 - WATER, 2 - EARTH, 3 - FIRE, 4 - AIR");
            pokemonType = Integer.parseInt(userInput.nextLine());
        }
         */

        Pokemon userPokemon = new Pokemon(pokemonType);
        User name = new User(userName);

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

//Loop until expected input is selected
        while (!(play.toUpperCase(Locale.of(play)).equals("Y") || play.toUpperCase(Locale.of(play)).equals("N"))){
            System.out.println("Please Enter a valid Response");
            play = userInput.nextLine();
        }

         if (play.equals("y") || play.equals("Y")) {
            System.out.println("Let's Begin");



             //The object will take the random number and give out a Pokémon with a random element everytime

             //an If statement that should allow for a Pokémon to be generated as long as the user has health
             //Random number between 1 - 4
             Random random = new Random();
             int randomNumber = random.nextInt(4)+1;
             Pokemon opponentPokemon = new Pokemon(randomNumber);



             //Will let the user know if they have an advantage or disadvantage facing a certain Pokémon with an element type
             System.out.println("Your opponent has a " + opponentPokemon.getElementTypeName()+ " Type pokemon !");
             int pokemonHealth =  userPokemon.getHealth();

//the loop will continue running as long as both the user's Pokémon health and the computer opponent's health are above 0
             while (pokemonHealth > 0 ){

                //Will end the while loop once the user loses
                 if (userPokemon.getHealth() <=   0){

                     System.out.println("You Lost");
                     System.out.println(name.getHighScore());
                     int wow = name.getHighScore();
                     wow --;
                     System.out.println(wow);
                     break;

                 } else if (opponentPokemon.getHealth() <= 0) {
                     System.out.println("You WON!");
                    // System.out.println(name.getHighScore());

                 }
                 System.out.println();
                 System.out.println("Pick an Attack: L , M , H , S ");

                 if(opponentPokemon.getHealth() <= 0 ){
                     int opponentHealth;
                     opponentHealth= 0 ;
                     System.out.println("Opponents Heath : " + opponentHealth);
                 }
                 else {
                     System.out.println("Opponents Heath : " + opponentPokemon.getHealth());
                 }

                 System.out.println();
                 System.out.print("Your Attack : ");
                 String attack = userInput.nextLine();

                 //Switch statement that will allow user to select what type of attack they want to perform
                 //to-lower will make sure the user input will be entered in as a lowercase
                 switch (attack.toLowerCase()) {
                     case "l" -> userPokemon.lightAttack(opponentPokemon);
                     case "m" -> userPokemon.mediumAttack(opponentPokemon);
                     case "h" -> userPokemon.heavyAttack(opponentPokemon);
                     case "s" -> userPokemon.specialAttack(opponentPokemon);
                 }
                 while (!(attack.toLowerCase(Locale.of(attack)).equals("l") || attack.toLowerCase(Locale.of(attack)).equals("m")||attack.toLowerCase(Locale.of(attack)).equals("h")||attack.toLowerCase(Locale.of(attack)).equals("s")))
                 {
                     System.out.println("Please enter a valid Attack");
                     System.out.print("Your Attack : ");
                     attack = userInput.nextLine();
                 }
//The logic to allow the computer to generate an attack too, will use another switch statement

                 //Random randomLetter = new Random();
                 String[] computerAttack = {"l", "m", "h", "s"};
                 String randomAttackType = computerAttack[random.nextInt(computerAttack.length)];


                 System.out.println();

                 switch (randomAttackType) {
                     case "l" -> {
                         System.out.println("Opponent used a light attack");
                         opponentPokemon.lightAttack(userPokemon);
                     }
                     case "m" -> {
                         System.out.println("Opponent used a medium attack");
                         opponentPokemon.mediumAttack(userPokemon);
                     }
                     case "h" -> {
                         System.out.println("Opponent used a heavy attack");
                         opponentPokemon.heavyAttack(userPokemon);
                     }
                     case "s" -> {
                         System.out.println("Opponent used a special  attack");
                         opponentPokemon.specialAttack(userPokemon);
                     }
                 }

                 if (userPokemon.getHealth() > 0)
                 {
                 System.out.println("Your Health: " + userPokemon.getHealth());

                 }
                 else if (userPokemon.getHealth()<= 0)
                 {
                     int userPokemonHealth;
                     userPokemonHealth= 0;
                     System.out.println("Your Health: " + userPokemonHealth);
                 }

                 if (opponentPokemon.getHealth() <= 0){
                     System.out.println();
                     pokemonHealth +=10;
                     System.out.println("Your Health: " + userPokemon.giveHealth());

                     //This is the creation of a new Pokémon once the previous one is defeated
                     randomNumber = random.nextInt(4) + 1;
                     opponentPokemon = new Pokemon(randomNumber);
                     System.out.println("You WON");
                     System.out.println(name.getHighScore());
                     System.out.println("Your new opponent has a " + opponentPokemon.getElementTypeName() + " Type pokemon !");

                 }
             }
        }
         else if (play.equals("n") || play.equals("N")) {
            System.out.println("Bye");
        }
    }
}