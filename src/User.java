import java.util.HashMap;
public class User {

    private String trainerName;
    private int highScore = 0;
    private int score = 0;

    public User(String trainerName) {

        this.trainerName = trainerName;
        this.highScore = highScore;
        this.score = score;


    }

    //Add a method to allow the high score to go up 1 point when a Pokémon is defeated
    public void scoreTracker(String trainerName){


        HashMap<String, Integer> highScore = new HashMap<String, Integer>();
        this.trainerName = trainerName;
        highScore.put(trainerName, getHighScore());

        System.out.println(highScore.get(trainerName));
        System.out.println(highScore.get(getHighScore()));

    }

    // Can use to increase the highscore
    public  int getHighScore(){
         highScore++;
         System.out.print("Your Score : ");
         return highScore;
    }
}
