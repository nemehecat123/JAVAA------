package pravokotnik;

public class glv {
    public static void main(String[] args) {
        pravokotnik p = new pravokotnik(4, 4);
        kvadr k = new kvadr(4,4,4);
        System.out.println(k.volumen());
        System.out.println( k.površina());
        System.out.println(p.ploščina());
        System.out.println(p.obseg());
    }
    
}
