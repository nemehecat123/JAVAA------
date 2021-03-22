import java.util.Scanner;
public class Spremenljivke {
    public static void main(String[]args) {
        try (Scanner input =new Scanner(System.in)){;
        System.out.println("a,b,c,d,r");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        
        System.out.println(a*b*c*d);

        }
    }
}
    