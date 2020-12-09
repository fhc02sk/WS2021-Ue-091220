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

    }
}
