public class Game
{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    private boolean bonus;

    private int totalScore;

    public Game(boolean b, boolean l1f, boolean l2f, boolean l3f, int l1s, int l2s, int l3s){
        levelOne = new Level(l1f, l1s);
        levelTwo = new Level(l2f, l2s);
        levelThree = new Level(l3f, l3s);
        bonus = b;
        totalScore = 0;
    }

    public void changeGame(boolean b, boolean l1f, boolean l2f, boolean l3f, int l1s, int l2s, int l3s){
        levelOne = new Level(l1f, l1s);
        levelTwo = new Level(l2f, l2s);
        levelThree = new Level(l3f, l3s);
        bonus = b;
    }

    public boolean isBonus(){
        return bonus;
    }

    public void play(){
        totalScore = this.getScore();
    }

    public int getScore(){
        int total = 0;
        if(levelOne.goalReached()){
            total += levelOne.getPoints();
            if(levelTwo.goalReached()){
                total += levelTwo.getPoints();
                if(levelThree.goalReached()) total += levelThree.getPoints();
            }
        }
        if(bonus) return total*3;
        return total;
    }

    public int playManyTimes(int num){
        int highScore = totalScore;
        for(int i=0; i<num; i++){
            this.play();
            if(totalScore>highScore){
                highScore = totalScore;
            }

            int
            this.changeGame()
        }
    }
}