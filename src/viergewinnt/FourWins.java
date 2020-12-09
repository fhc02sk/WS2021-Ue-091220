package viergewinnt;

public class FourWins {
    private int sizeX;
    private int sizeY;
    private char[][] charArray;

    public FourWins(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        charArray = new char[sizeY][sizeX];

        for (int i = 0; i < charArray.length; i++) { /* sizeX */
            for (int j = 0; j < charArray[i].length; j++) { /* sizeY */
                charArray[i][j] = ' ';
            }
        }
    }

    public char fourInRow(){

        return 'X';
    }

    public char fourInColumn(){

        return 'X';
    }

    public char winner() {
        return 'X';
    }

    public boolean playerA(int x, int y){
        if (charArray[y][x] == ' ') {
            charArray[y][x] = 'A';
            return true;
        }
        return false;
    }

    public boolean playerB(int x, int y){
        if (charArray[y][x] == ' ') {
            charArray[y][x] = 'B';
            return true;
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                System.out.print(charArray[i][j] + " - ");
            }
            System.out.println();
        }
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }
}
