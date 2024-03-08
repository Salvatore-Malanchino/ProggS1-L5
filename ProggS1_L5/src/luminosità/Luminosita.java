package luminosità;

public class Luminosita {
    int luminosita=0;


    public Luminosita(int lum) {
        this.luminosita=lum;
    }
    public void aumentaLuminosita(){
        do {
            if (luminosita==1){
                System.out.println("luminosita:*");
            }else if (luminosita==2){
                System.out.println("luminosita:**");
            }else if (luminosita==3){
                System.out.println("luminosita:***");
            }else if (luminosita==4){
                System.out.println("luminosita:****");
            }else if (luminosita==5){
                System.out.println("luminosita:*****");
                System.out.println("VOLUME AL MASSIMO");
            }else {
                System.out.println("AUMENTA LA LUMINOSITà");
            }
        }while (luminosita<6);


    }


}
