package nekej;

public class UrniDelavec extends DelavecSuper {
    protected double urnaPostavka;
    protected int štUr;
    @Override
    public double getBrutoPlača() {
        brutoPlača =štUr*urnaPostavka;
        return brutoPlača;
    }

    @Override
    public void izpis() {
        System.out.println("*******URNI DELAVEC*********");
        System.out.println(" Id            "+ id);
        System.out.println(" ime           "+ ime);
        System.out.println(" št ur         "+ štUr);
        System.out.println(" urna postavka "+ urnaPostavka);
        System.out.println(" Bruto plača   "+ getBrutoPlača());
        System.out.println("***********************");
    
        
    }

    public double getUrnaPostavka() {
        return urnaPostavka;
    }

    public void setUrnaPostavka(double urnaPostavka) {
        this.urnaPostavka = urnaPostavka;
    }

    public int getŠtUr() {
        return štUr;
    }

    public void setŠtUr(int štUr) {
        this.štUr = štUr;
    }
   

    
}
