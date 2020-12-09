package lotto;


public class LottoDemo {

    public static void main(String[] args) {

        // Schreibe eine statische Methode, welche ein int-Array mit 6 Zufallszahlen
        // (Lotto-Tip) liefert.
        // Stelle dabei sicher, dass jede Zahl nur einmal vorkommt und somit eindeutig ist.

        double randValue = Math.random(); /* 0.00.. - 0.99.. */
        int intValue = (int) ((randValue * 45) + 1);
        int intValue2 = (int) ((Math.random() * 45) + 1);

        int[] arrLottoTip = generateLottoTip();

        for (int i = 0; i < arrLottoTip.length; i++) {
            System.out.print(arrLottoTip[i] + ", ");
        }

    }

    public static int[] generateLottoTip(){
        // Leeres Array generieren
        int[] arrLottoTip = new int[6];

        // for-Schleife über Array iterieren
        for (int i = 0; i < arrLottoTip.length; i++) {
            arrLottoTip[i] = -1;
            boolean success = false;
            do {
                int randValue = (int) (Math.random() * 45) + 1;
                if (!contains(arrLottoTip, randValue)) {
                    arrLottoTip[i] = randValue;
                    success = true;
                }
//                else
//                    System.out.println("doppelte zahl!: " + randValue);
            } while (!success);
        }

        return arrLottoTip;
    }

    public static boolean contains(int[] arr, int validate){
        // true/false retourniert, wenn die Zahl enthalten
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == validate) {
                return true;
            }
        }
        return false;
    }

}
