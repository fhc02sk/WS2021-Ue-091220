package lotto;


public class LottoDemo {

    public static void main(String[] args) {

        // Schreibe eine statische Methode, welche ein int-Array mit 6 Zufallszahlen
        // (Lotto-Tip) liefert.
        // Stelle dabei sicher, dass jede Zahl nur einmal vorkommt und somit eindeutig ist.

        double randValue = Math.random(); /* 0.00.. - 0.99.. */
        int intValue = (int) ((randValue * 45) + 1);
        int intValue2 = (int) ((Math.random() * 45) + 1);

        int[] arrLottoTip = new int[6]; /* 0 ... 5 */
    }

    public static int[] generateLottoTip(){
        // Leeres Array generieren
        // for-Schleife über Array iterieren
        // Auf jedes Element eine Zufallszahl schreiben
        // Sicherstellen, dass jede Zahl vorher noch nicht vorgekommen ist
    }

}
