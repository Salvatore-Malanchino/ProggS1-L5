package volume;

public class Volume {
     int volume=0;


    public Volume(int vol) {
        this.volume=vol;
    }
public void aumentaVolume(){
        do {
            if (volume==1){
                System.out.println("Volume:!");
            }else if (volume==2){
                System.out.println("Volume:!!");
            }else if (volume==3){
                System.out.println("Volume:!!!");
            }else if (volume==4){
                System.out.println("Volume:!!!!");
            }else if (volume==5){
                System.out.println("Volume:!!!!!");
                System.out.println("VOLUME AL MASSIMO");
            }else {
                System.out.println("AUMENTA IL VOLUME");
            }
        }while (volume<=6);


        }


}
