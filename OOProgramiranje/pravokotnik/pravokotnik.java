package pravokotnik;

public class pravokotnik {
    public pravokotnik(double d, double š) {
        a =d;
        b=š;
    }
    protected double a;
    protected double b;
    public double ploščina(){
        return a*b;
    }
    public double obseg(){
        return 2*a+2*b;
    }
    
}
