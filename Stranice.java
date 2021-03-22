import java.util.Scanner;
;public class Stranice {
    public static void main(String[]args) {
       try (Scanner input =new Scanner(System.in)){;
       
        System.out.println("upisi 2 spremenljivke stranice in radij kroga");
        double spremenljivka1= input.nextDouble();
        double spremenljivka2= input.nextDouble();
        double RadijKroga= input.nextDouble();
        

        double ploščina = (spremenljivka1*spremenljivka2 ) ;
        double radij =(RadijKroga*2*3.14);
        double ploščinakroga =(3.14*RadijKroga*RadijKroga);

        System.out.println("ploščina "+ spremenljivka1 +" in "+spremenljivka2 +" je "+ploščina);
        System.out.println("radij kroga je "+ radij);
        System.out.println("ploščina "+ploščinakroga);
       }
    }
    
}
