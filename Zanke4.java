import java.util.Scanner;

public class Zanke4 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("vnesi x");
        double x =sc.nextDouble();
        double vsota=1;
        double člen=1;
        // for (int k=1;k<=100;k++){
        //     člen=člen*x/k;
        //     vsota =vsota+člen;
        // } RAČUNAJ DOKLER NEBO NEKEJ
            int k=1;
        // while(Math.abs(vsota-Math.exp(x))>=0.000001){
        //         člen=člen*x/k;
        //         k++;
        //         vsota=vsota+člen;
        do{
        člen=člen*x/k;
        k++;
                vsota=vsota+člen;
 }
 while(Math.abs(vsota-Math.exp(x))>=0.000001);
        System.out.println("izračunan rezultat je "+vsota);
        System.out.println("rač ima               "+Math.exp(x));
        System.out.println("k="+k);
        sc.close();
    }
}
