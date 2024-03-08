package volume;

import java.util.Scanner;

public class Volume {
     int volume=0;


    public Volume(int vol) {
        this.volume=vol;
    }

    public void regolaVolume(Scanner myScanner){

        do{
            volumeAttuale(this.volume);
            System.out.println("Vuoi aumentare o diminuire il volume? fai: +/- ");
            System.out.println("oppure digita si per confermare");
            String scelta= myScanner.next();


             if (scelta.equals("+")){
                if (this.volume <5){
                    System.out.println("Volume aumentato");
                    volume++;
                }else {
                    System.out.println("Volume al massimo");
                }

            } else if (scelta.equals("-")) {
                 if (this.volume >0){
                     System.out.println("Volume diminuito");
                     this.volume--;
                 }else {
                     System.out.println("Volume al minimo");
                 }
                 System.out.println("confermi la tua scelta? si per confermare");
                 String risposta=myScanner.next();

                 if (risposta.equals("si")){
                     break;
                 }
             }
        }while (true);

    }

    public void volumeAttuale(int vol) {
        switch (vol) {
            case 1:
                System.out.println("Volume:!");
                break;
            case 2:
                System.out.println("Volume:!!");
                break;
            case 3:
                System.out.println("Volume:!!!");
                break;
            case 4:
                System.out.println("Volume:!!!!");
                break;
            case 5:
                System.out.println("Volume:!!!!!");
                break;
            default:
                System.out.println("Parametro non valido, scegli da 1 a 5");
                break;
        }
    }
    }