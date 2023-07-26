public class User {

    public String trainerName;
    private int highScore = 0;
    private int score = 0;

    public User(String trainerName) {
        this.trainerName = trainerName;
        this.highScore = highScore;


    }

    //Add a method to allow the high score to go up 1 point when a Pokémon is defeated
    public void scoreTracker(){

    }

    // Can use to increase the highscore
    public  int getHighScore(){
         highScore++;
         System.out.print("Your Score : ");
         return highScore;
    }
}
