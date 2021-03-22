import java.util.Scanner;
public class FloydovTrikotnik {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("kolko vrstic želiš ");
        int stVrstic=sc.nextInt();
        int stevilo =0;
        for (int k=0; k<=stVrstic;k++){
            for(int i =1;i<=k;i++){
            stevilo++;
            System.out.printf("%-4d",stevilo);

            }
            System.out.println();

        }
        sc.close();
        
    }
}
