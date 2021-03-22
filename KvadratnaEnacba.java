import java.util.Scanner;
import java.lang.Math;
public class KvadratnaEnacba {
    public static void main(String[]args) {
        try (Scanner input =new Scanner(System.in)){
        System.out.println("vpiši spremenljivke kvadratne enačbe");
        System.out.println("a, b, c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double D;
        D = b*b-4*a*c;
        if(D<0){
            System.out.println("enačba nima rešitve");

        }
        else {

        double rešitev = ((-b+Math.sqrt(b*b-(4*a*c)))/(2*a));
        double rešitev2 = ((-b+Math.sqrt(b*b+(4*a*c)))/(2*a));
        System.out.println("rešitev ena je " + rešitev);
        System.out.println("rešitev dva je "+rešitev2);
        }

        }
        
        
        
    }
    
}