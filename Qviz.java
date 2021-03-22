import java.util.Scanner;
//import java.util.function.LongUnaryOperator;
public class Qviz {
    public static void main(String[]args) {
       int number1=(int)(System.currentTimeMillis()% 10); // % je ostanek... primer ce bi blo 23 % 10 = 3
       int number2=(int)(System.currentTimeMillis() *7%10);
       int number3=(int)(System.currentTimeMillis()*3%10);
       
       
       Scanner input = new Scanner(System.in);
       System.out.print(
           "koliko je"+ number1 + "+"+ number2+"?" );

           int answer = input.nextInt();
           System.out.println(
               number1+"+"+number2+"="+answer+" je "+(number1+number2== answer));
               
        System.out.print(
        "koliko je"+ number1+ "*"+ number2+"*"+number3+"?");

        int answer2 = input.nextInt();
        System.out.println(
               number1+"*"+number2+"*"+number3+" = "+ answer2 +(number1*number2*number3 == answer2));
            input.close();

            // po vrsti uredi
            if (answer<answer2){
                System.out.println("najmanjse stevilo je "+answer);
                System.out.println("najvecje stevilo je "+answer2);

            }else {
                    System.out.println("najmanjse stevilo je "+answer2);
                    System.out.println("najvecje stevilo je "+answer);
                }

            

    }
}