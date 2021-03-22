import java.util.Random;
import java.util.Scanner;
public class Loterija {
    public static void main(String []args) {
        Random random = new Random();
        int random1 = random.nextInt(10);
        int random2 = random.nextInt(10);
        int random3 = random.nextInt(10);
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();
        System.out.println("vnesite srečne 3 številke");
        int j;
        if (a==random1){
            System.out.println("prva št je pravilna");
             j= input.nextInt();
        }else{
            System.out.println("prva številka je napačna");
             j= input.nextInt();
        }
        int k;
        if (b==random2){
            System.out.println("druga št je prav");
             k= input.nextInt();
        }else{
            System.out.println("druga št je napačna");
             k= input.nextInt();
        }
        int m;
            
        if (c==random3){
            System.out.println("tretja št je prav");
             m= input.nextInt();
        }else{
            System.out.println("tretja št je napačna");
             m= input.nextInt();
        }
        if ((j+k+m)==6){
            System.out.println("zadel si loterijo");
        }
        
    }
}
