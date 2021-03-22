
import java.util.Scanner;
public class KvadratEna {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("dolžina a");
       double a =  input.nextDouble();
       System.out.println("dolžina b");
       double b =  input.nextDouble();//stranice
       System.out.println("koordinta x leve stranice trikotnika");
       double x =  input.nextDouble();
       System.out.println("koordinata y leve stranive trikotnika");
       double y =  input.nextDouble();//njegova leva stranica kje bo 
       System.out.println("točka x po izbiri");
       double Xena =  input.nextDouble();
       System.out.println("točka y po izbiri");
       double Yena =  input.nextDouble();//kje bo njegova izbrana točka
       double iks =  0;
       double ips =  0;//koordinatni sistem, ki se bo "premiku"
       input.close();
       double iksEna =iks+x+a;
       double ipsEna =ips+y+b;
       iks=iks+x;
       ips=ips+y;
       System.out.println("---------------------");
       System.out.println(iks);
       System.out.println(ips);
       System.out.println(ipsEna);
       System.out.println(iksEna);
       if((iks<=Xena)&&(Xena<=iksEna))
       System.out.println("točka x je v kvadratu");
       
       else
       System.out.println("ni  u kvadratu");

       if((ips<Yena)&&(Yena<=ipsEna))
       System.out.println("Točka y v kvadratu!!!");
       else 
       System.out.println("točka ni v kvadratu");
       

    }
}