    import java.util.Scanner;
    ;public class Import {
        public static void main(String[]args) {
        try (Scanner input =new Scanner(System.in)){;
            System.out.println("upisi 3 stevilke");
        double number1= input.nextDouble();
        double number2= input.nextDouble();
        double number3= input.nextDouble();

        double average = (number1+ number2+ number3) /3;

        System.out.println("povprečje "+ number1+ " "+number2+ " "+ number3+"je"+average);
    }
    }
    
}
