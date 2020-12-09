package strafen;

public class Strafe {
    private String vorname;
    private String nachname;
    private String kennzeichen;
    private int strafnummer;
    private double strafe;
    private byte anzahl;
    private static int counter;

    public Strafe(String vorname, String nachname, String kennzeichen) {
        counter++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.kennzeichen = kennzeichen;
        strafe = 0;
        anzahl = 0;
        strafnummer = counter;
    }

    public void strafe(int geschwindigsuebschreitung){
        anzahl += 1;
        if (geschwindigsuebschreitung <= 20)
            strafe += 30;
        else if (geschwindigsuebschreitung <= 30)
            strafe += 50;
        else if (geschwindigsuebschreitung <= 50)
            strafe += 100;
        else if (geschwindigsuebschreitung <= 100)
            strafe += 500;
        else
            strafe += 1500;
    }

    public void verbandspaket(){
        anzahl += 1;
        strafe += 25;
    }

    public String toString() {
        return "Strafe{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", kennzeichen='" + kennzeichen + '\'' +
                ", strafnummer=" + strafnummer +
                ", strafe=" + strafe +
                ", anzahl=" + anzahl +
                '}';
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getStrafnummer() {
        return strafnummer;
    }

    public double getStrafe() {
        return strafe;
    }

    public byte getAnzahl() {
        return anzahl;
    }
}
