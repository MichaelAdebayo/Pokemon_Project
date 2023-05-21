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

        //a do-while loop to make sure the user selects a valid response
        if(pokemonType > 4 || pokemonType < 1) {
            do {
                System.out.println("Please Enter a valid Pokemon Type!");

                System.out.println("1 - WATER, 2 - EARTH, 3 - FIRE, 4 - AIR");
                pokemonType = Integer.parseInt(userInput.nextLine());
            }
            while (pokemonType > 4 || pokemonType < 1);
        }


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
         if (play.equals("y") || play.equals("Y")) {
            System.out.println("Let's Begin");

            // This is just to test to make sure the functions are working correctly
             //The object will take the random number and give out a Pokémon with a random element everytime
             Pokemon testPokemon = new Pokemon(randomNumber);
             //Will let the user know if they have an advantage or disadvantage facing a certain Pokémon with an element type
             System.out.println("Your opponent has a " + testPokemon.getElementTypeName()+ " Type pokemon !");
             int pokemonHealth =  userPokemon.getHealth();


             while (pokemonHealth > 0 || testPokemon.getHealth() <= 0){

                    pokemonHealth =  userPokemon.getHealth();

                //Will end the while loop once the user loses
                 if (pokemonHealth <=   0){

                     System.out.println("You Lost");
                     break;

                 } else if (userPokemon.getHealth() <= 0) {
                     System.out.println("You WON");

                 }
                 System.out.println();
                 System.out.println("Pick an Attack: L , M , H , S ");
                 System.out.println("Opponents Heath : " + testPokemon.getHealth());
                 System.out.println();
                 String attack = userInput.nextLine();

                 //Switch statement that will allow user to select what type of attack they want to perform
                 //to-lower will make sure the user input will be entered in as a lowercase
                 switch (attack.toLowerCase()) {
                     case "l" -> userPokemon.lightAttack(testPokemon);
                     case "m" -> userPokemon.mediumAttack(testPokemon);
                     case "h" -> userPokemon.heavyAttack(testPokemon);
                     case "s" -> userPokemon.specialAttack(testPokemon);
                 }
// Will have to add the logic to allow the computer to generate an attack too, will use another switch statement

                 //Random randomLetter = new Random();
                 String[] computerAttack = {"l", "m", "h", "s"};
                 String randomAttackType = computerAttack[random.nextInt(computerAttack.length)];


                 System.out.println();

                 switch (randomAttackType) {
                     case "l" -> {
                         System.out.println("Opponent used a light attack");
                         testPokemon.lightAttack(userPokemon);


                     }
                     case "m" -> {
                         System.out.println("Opponent used a medium attack");
                         testPokemon.mediumAttack(userPokemon);

                     }
                     case "h" -> {
                         System.out.println("Opponent used a heavy attack");
                         testPokemon.heavyAttack(userPokemon);


                     }
                     case "s" -> {
                         System.out.println("Opponent used a special  attack");
                         testPokemon.specialAttack(userPokemon);


                     }
                 }
                 System.out.println("Your Health: " + pokemonHealth );

                 if (testPokemon.getHealth() <= 0){
                     System.out.println();
                     pokemonHealth +=10;
                     System.out.println("Your Health: " + pokemonHealth );

                 }



             }



        }
         else if (play.equals("n") || play.equals("N")) {
            System.out.println("Bye");
        }


    }
}