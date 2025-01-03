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
        this.totalScore = this.getScore();
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

            double randomBonus = Math.random()*2;
            boolean setBonus = false;
            if(randomBonus<1) setBonus = false;
            else setBonus = true;

            double randomL1f = Math.random()*2;
            boolean setL1f = false;
            if(randomL1f<1) setL1f = false;
            else setL1f = true;

            double randomL2f = Math.random()*2;
            boolean setL2f = false;
            if(randomL2f<1) setL2f = false;
            else setL2f = true;

            double randomL3f = Math.random()*2;
            boolean setL3f = false;
            if(randomL3f<1) setL3f = false;
            else setBonus = true;

            int setL1s = (int)(Math.random()*100);
            int setL2s = (int)(Math.random()*100);
            int setL3s = (int)(Math.random()*100);

            this.changeGame(setBonus, setL1f, setL2f, setL3f, setL1s, setL2s, setL3s);
            System.out.print("Game ");
            System.out.print(i + 1);
            System.out.println(": ");
            System.out.print("Bonus: ");
            System.out.println(setBonus);
            System.out.print("Level 1 finished: ");
            System.out.println(setL1f);
            System.out.print(" with score: ");
            System.out.println(setL1s);
            System.out.print("Level 2 finished: ");
            System.out.println(setL2f);
            System.out.print(" with score: ");
            System.out.println(setL2s);
            System.out.print("Level 3 finished: ");
            System.out.println(setL3f);
            System.out.print(" with score: ");
            System.out.println(setL3s);
            System.out.print("Total Score: ");
            System.out.println(this.getScore());

        }
        return highScore;
    }
}