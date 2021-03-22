import java.util.Scanner;
public class Ruleta {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Prvo vpišite svojo začetno stavo potem pa koliko stavite");
        int stanje =sc.nextInt();
        int stava= sc.nextInt();
        int začStava=stava;
        int začStanje= stanje;
        int min=stanje;
        int max=stanje;
        int kroglica;
        int met=0;
        String barva;
        for(int k =0; k<=10;k++){
            kroglica=(int)(Math.random()*37);
            kroglica=kroglica%2;
            if(kroglica==0){
                stanje=stanje+stava;
                stava=začStava;
                barva="rdeča";
            }
            else{ 
                stanje=stanje-stava;
                stava=2*stava;
                barva="črna";   
            }
            System.out.println("Met  ;\t"+met+",  Barva  ;\t"+barva+",  Stanje "+stanje);
            if (stanje>začStanje){
                max=stanje;   
            }
            if (stanje<začStanje){
                min=stanje; 
            }
            met++;
        }
        System.out.println("število metov je 10");
        System.out.println("začetno stanje je "+ začStanje);
        System.out.println("končno stanje je "+stanje);
        System.out.println("tolko je maximum "+max);
        System.out.println("tolko je minimum "+min);
        if (stanje>začStanje){
            System.out.println( "dobiček je "+ (stanje-začStanje)+"$");
        }
        if (stanje<začStanje){
            System.out.println("izguba je "+(stanje-začStanje));

        }
    sc.close();
    }
}
