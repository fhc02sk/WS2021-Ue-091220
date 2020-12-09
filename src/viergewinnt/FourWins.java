package viergewinnt;

public class FourWins {
    private int sizeX;
    private int sizeY;
    private char[][] charArray;

    public FourWins(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        charArray = new char[sizeY][sizeX];

        for (int i = 0; i < charArray.length; i++) { /* sizeY */
            for (int j = 0; j < charArray[i].length; j++) { /* sizeX */
                charArray[i][j] = ' ';
            }
        }
    }

    public char fourInRow(){
        for (int i = 0; i < charArray.length; i++) {
            // Schleife für Zeilen
            int counter = 0;
            char player = ' ';
            for (int j = 0; j < charArray[i].length; j++) {
                if (charArray[i][j] == ' '){
                    counter = 0;
                    player = ' ';
                }
                else{
                    // in dem Feld steht ein 'A' oder 'B'
                    if (player == charArray[i][j]){
                        counter++;
                    }
                    else {
                        player = charArray[i][j];
                        counter = 1;
                    }
                }
                if (counter == 4){
                    return player;
                }
            }
        }

        return 'X';
    }

    public char fourInRow2(){
        for (int i = 0; i < charArray.length; i++) {
            // Schleife für Zeilen
            for (int j = 0; j < charArray[i].length - 3; j++) {
                if (charArray[i][j] != ' '){
                    char player = charArray[i][j];
                    if (charArray[i][j+1] == player
                            && charArray[i][j+2] == player
                            && charArray[i][j+3] == player){
                        return player;
                    }
                }
            }
        }

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
