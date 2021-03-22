package krogNaloga;

public class Krog {
    protected double polmer;
    
    public Krog( double p ) { //

        polmer=p;
    }
	public double getPolmer() {
		return polmer;
	}

	public void setPolmer(double polmer) {
		this.polmer = polmer;
	}
    public double  ploščina() {
    
        return Math.PI*Math.pow(polmer, 2);
    }
    public double obseg(){
        
        return Math.PI*2*polmer;
    }
    
    }
    

