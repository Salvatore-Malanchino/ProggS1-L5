package luminosità;

import java.util.Scanner;

public class Luminosita {
    int luminosita=0;


    public Luminosita(int lum ) {
        this.luminosita=lum;}
    public void regolaLuminosita(Scanner myScanner){

        do{
            luminositaAttuale(luminosita);
            System.out.println("Vuoi aumentare o diminuire la luminosità? fai: +/- ");

            String scelta= myScanner.next();

            if (scelta.equals("+")){
                if (luminosita <5){
                    System.out.println("Luminosità aumentata");
                    luminosita++;
                }else {
                    System.out.println("Luminosità al massimo");
                }

            } else if (scelta.equals("-")) {
                if (luminosita >0){
                    System.out.println("Luminosità diminuita");
                    luminosita--;
                }else {
                    System.out.println("Luminosità al minimo");
                }
                System.out.println("confermi la tua scelta? si per confermare");
                String risposta=myScanner.next();

                if (risposta.equals("si")){
                    break;
                }
            }
        }while (true);
    }

    public void luminositaAttuale(int lum){
        switch (lum){
            case 1:
                System.out.println("Luminosità:*");
                break;
            case 2:
                System.out.println("Luminosità:**");
                break;
            case 3:
                System.out.println("Luminosità:***");
                break;
            case 4:
                System.out.println("Luminosità:****");
                break;
            case 5:
                System.out.println("Luminosità:*****");
                break;
            default:
                System.out.println("Parametro non valido, scegli da 1 a 5");
        }

    }
}

