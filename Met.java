import java.util.Scanner;

public class Met{
    static double ta, tb;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Vpiši kot meta: ");
        double alfa = input.nextDouble();
        System.out.println("Vpiši zacetno hitrost meta: ");
        double v0 = input.nextDouble();

        double g = 9.8;
        double ym; //maksimalna višina
        ym = Math.pow(v0,2) * Math.pow(Math.sin(Math.toRadians(alfa)),2)/(2 * g);
        //System.out.println("Max visina: " + ym + "m");
        int ymi = (int)ym;
        double tdelta = 0.2; // casovni interval za izris [s]
        int ydelta = 2; // vsaka vrstica izrisa je toliko [m]
        //cas, ko je visina max
        solve(v0, alfa, ym);
        //System.out.println("Cas ob ymax: " + ta + "s");

        while(ymi > 0){
            solve(v0, alfa, ymi);
            //System.out.println("ta: " + ta + " tb: " + tb);
            int tad = (int)(ta/tdelta);
            int tbd = (int)(tb/tdelta);
            //System.out.println("tad: " + tad + " tbd: " + tbd);
            int x = 0;
            while(x<=tbd){
                if(x==tad || x==tbd)
                    System.out.print("*");
                else
                    System.out.print(" ");
                x++;
            }
            System.out.println("");
            ymi-=2;
        }
    }

   static void solve(double v0, double alfa, double y){
        double a = 0.5 * 9.8;
        double b = -v0 * Math.sin(Math.toRadians(alfa));
        double c = y;
        double determinanta = b * b - 4 * a * c;
        if(determinanta > 0) {
            ta = (-b - Math.sqrt(determinanta)) / (2 * a);
            tb = (-b + Math.sqrt(determinanta)) / (2 * a);
            //System.out.format("root1 = %.2f and root2 = %.2f", ta , tb);
        }
        else if(determinanta == 0) {
            ta = tb = -b / (2 * a);
            //System.out.format("root1 = root2 = %.2f;", ta);
        }
        else {
            System.out.println("Kvadratna enacba nima resitve!");
        }
    }
}