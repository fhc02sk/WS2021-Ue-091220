package strafen;

public class DemoStrafeApp {
    public static void main(String[] args) {


        Strafe max = new Strafe("Max", "Muster", "G-1234AB");
        Strafe susi = new Strafe("Susi", "Sorglos", "G-5678AB");
        Strafe drei = new Strafe("Maxi", "Mustermann", "G-8742AB");
        
        System.out.println("max.toString() = " + max.toString());
        System.out.println("susi.toString() = " + susi.toString());
        System.out.println("drei.toString() = " + drei.toString());

        susi.alkohol(1);
        System.out.println("susi.toString() = " + susi.toString());
        susi.strafe(35);
        System.out.println("susi.toString() = " + susi.toString());
        susi.verbandspaket();

        System.out.println(susi.getStrafe());

    }
}
