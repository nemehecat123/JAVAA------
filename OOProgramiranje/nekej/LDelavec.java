package nekej;

public class LDelavec extends Delavec    {
    public LDelavec() {
       super();
    }
    private double letnaPlača;

    public double getLetnaPlača() {
        return letnaPlača;
    }

    public void setLetnaPlača(double letnaPlača) {
        this.letnaPlača = letnaPlača;
    }
    public double getBrutoPlača(){
        brutoPlača =letnaPlača/12; 
        return brutoPlača;
    }
    
}
