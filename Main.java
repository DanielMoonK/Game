public class Main{
    public static void main(String[] args){
        Game game1 = new Game(true, true, true, true, 200, 100, 500);
        System.out.print("Game 1 Total Score: ");
        System.out.println(game1.getScore());
        Game game2 = new Game(false, true, true, false, 200, 100, 500);
        System.out.print("Game 2 Total Score: ");
        System.out.println(game2.getScore());
        Game game3 = new Game(true, true, false, true, 200, 100, 500);
        System.out.print("Game 3 Total Score: ");
        System.out.println(game3.getScore());
        Game game4 = new Game(false, false, true, true, 200, 100, 500);
        System.out.print("Game 4 Total Score: ");
        System.out.println(game4.getScore());

        System.out.println("----------------------------------------");

        Game randomGame = new Game(false, true, true, true, 10, 10, 10);
        System.out.println(randomGame.playManyTimes(2));
    }
}