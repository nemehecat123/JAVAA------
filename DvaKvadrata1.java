import java.util.Scanner;

//import javax.lang.model.util.ElementScanner6; 
public class DvaKvadrata1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //center 1 kvadrata 
        System.out.println("center x in pol y");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        //višina širina 1. kvadrata 
        System.out.println("širina in pol višina");
        double w1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        // premik koordinate x in y v levo čošak spodej stran kvadrata
        x1= w1/2;
        y1=h1/2;
        //center druzga kvadrata.
        System.out.println("ceter 2 kvadrata x ,y ");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        //višina 2 in širina 2
        System.out.println("širina in višina druzga");
        double w2=sc.nextDouble();
        double h2=sc.nextDouble();
        x2= w2/2;
        y2=h2/2;

        System.out.println("točka x1 "+x1);
        System.out.println("toška x2 "+x2);
        System.out.println("točka y1 "+y1);
        System.out.println("točka y2 "+y2);
        //prvo prever če je točka v sistemu 
        boolean proba;
        boolean proba1;
        if((x1<=x2)&&(x2<=x1+w1)){// če bo točka x1 manjša kukr x2 in x1 +w1 večja od x2
         System.out.println("točka x je notr");
         proba=true;
        } 
        else{
        System.out.println("točka x je zunej");
        proba=false;
        }

        if((y1<=x2)&&(y2<=y1+h2)){// če bo točka x1 manjša kukr x2 in x1 +w1 večja od x2
            System.out.println("točka y je notr");            
            proba1=true;
        }                           // za  zdej mi premakne obe točke od kvadrata v spodnji levi kot.... zdej mormo nardit, da se bo
        else{
        System.out.println("točka y je zunej");
        proba1=false;
    }
    if((proba1&&proba)==true)
    System.out.println("točka je v kvadratu");
        // System.out.println(proba);
    sc.close();
    }
}
