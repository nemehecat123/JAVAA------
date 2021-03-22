package nekej;

public  class LetniDelavec extends DelavecSuper {
    private double letnaPlača;
    @Override
    public double getBrutoPlača() {
        brutoPlača =letnaPlača/12; 
        return brutoPlača;
    }

    @Override
    public void izpis() {
       System.out.println("*******Letni DELAVEC*********");
        System.out.println(" Id            "+ id);
        System.out.println(" ime           "+ ime);
        System.out.println(" Bruto plača   "+ getBrutoPlača());
        System.out.println("***********************");
    
    
        
    }

    public double getLetnaPlača() {
        return letnaPlača;
    }

    public void setLetnaPlača(double letnaPlača) {
        this.letnaPlača = letnaPlača;
    }
    
}
