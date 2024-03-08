import luminosità.Luminosita;
import volume.Volume;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Scegli volume da 1 a 5: ");
        int volumeInput = myScanner.nextInt();
        Volume volume = new Volume(volumeInput);
        volume.regolaVolume(myScanner);
        System.out.println("Scegli una luminosita da 1 a 5: ");
        int luminositaInput = myScanner.nextInt();
        Luminosita luminosita = new Luminosita(luminositaInput);
        luminosita.regolaLuminosita(myScanner);
    }
}