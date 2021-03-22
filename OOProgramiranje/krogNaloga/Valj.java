package krogNaloga;

public class Valj extends Krog {
    public Valj(double p, double v) {
        super(p);
        visina =v;
    }
    protected double visina;
    public double prostornina() {
        
        return visina*ploščina();
    }
    public double površina(){
        
        return 2*super.ploščina()+super.obseg()*visina;
    }
    
}
