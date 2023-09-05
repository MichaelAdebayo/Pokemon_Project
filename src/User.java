import java.util.HashMap;
public class User {

    private String trainerName;
    private int highScore;
    private int score ;

    public User(String trainerName) {

        this.trainerName = trainerName;
        this.highScore = 0;
        this.score = 0;

    }

    // Can use to increase the score
    public  int getScore(){
        System.out.print("Your Score : ");
        return score;
    }

    //Method used that will increment the score by 1 each time it is called
    public int addScore(){
        score++;
        return 1;
    }

    //Add a method to allow the high score to go up 1 point when a Pokémon is defeated
    public void scoreTracker(String trainerName){


        HashMap<String, Integer> highScore = new HashMap<String, Integer>();
        this.trainerName = trainerName;
        highScore.put(trainerName, getScore());

        System.out.println(highScore);

    }



}
