package volume;

import java.util.Scanner;

public class Volume {
     int volume=0;


    public Volume(int vol) {
        this.volume=vol;
    }

    public void aumentaVolume(Scanner myScanner){

        do {
            volumeAttuale(volume);
            System.out.println("Confermi la tua scelta? si/no");
            String risposta= myScanner.next();
            if (risposta.equals("si")){
                break;
            }else if (risposta.equals("no")){
                if (volume <5){
                    System.out.println("Volume aumentato");
                    volume++;
                }else {
                    System.out.println("Luminosità al massimo");
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
                System.out.println("Vlume:!!!");
                break;
            case 4:
                System.out.println("Volume:!!!!");
                break;
            case 5:
                System.out.println("Volume:!!!!!");
                break;
            default:
                System.out.println("Parametro non valido, scegli da 1 a 5");
        }
    }
    }