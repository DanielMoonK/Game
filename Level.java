public class Level
{
    private boolean finished;
    private int points;

    public Level(boolean f, int p){
        finished = f;
        points = p;
    }

    public boolean goalReached(){
        return finished;
    }

    public int getPoints(){
        return points;
    }

    public void change(boolean finish, int score){
        finished = finish;
        points = score;
    }
}