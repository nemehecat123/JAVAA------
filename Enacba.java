import java.util.Scanner;
public class Enacba {
    public static void main(String[]args) {
        try (Scanner input =new Scanner(System.in)){;
        System.out.println("a,b,c,d,r");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        
        
        double rešitev = (4/3/(+34)-9*(a + b*c)+ (3+d)*(2+a)/(a+b*d));
        System.out.println(rešitev);
        }
    }
    
}