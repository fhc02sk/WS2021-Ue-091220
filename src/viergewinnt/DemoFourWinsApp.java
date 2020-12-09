package viergewinnt;

public class DemoFourWinsApp {
    public static void main(String[] args) {

        FourWins game = new FourWins(7, 8);

        System.out.println("Erste Runde");
        game.playerA(1,1);
        game.playerB(2,2);
        game.print();

        System.out.println("Zweite Runde");
        game.playerA(1,2);
        game.playerB(2,3);
        game.print();

        System.out.println("Zweite Runde");
        game.playerA(2,1);
        game.playerA(3,1);
        game.playerA(4,1);
        game.playerB(2,4);
        game.playerB(2,5);
        game.print();

       /* System.out.println("game.fourInRow() = " + game.fourInRow());
        System.out.println("game.fourInRow2() = " + game.fourInRow2());
        System.out.println("game.fourInColumn() = " + game.fourInColumn());*/

        System.out.println("game.winner() = " + game.winner());
    }
}
