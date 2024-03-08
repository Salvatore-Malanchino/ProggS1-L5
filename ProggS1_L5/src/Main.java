import luminosità.Luminosita;
import volume.Volume;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Scegli volume da 1 a 5: ");
        Volume volume=new Volume(myScanner.nextInt());
       volume.aumentaVolume(myScanner);
        System.out.println("Scegli unna luminosita da 1 a 5: ");
        Luminosita luminosita=new Luminosita(myScanner.nextInt());
        luminosita.aumentaLuminosita(myScanner);
    }
}