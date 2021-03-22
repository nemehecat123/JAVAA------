public class IzredniStudent extends Student{
    private double šolnina;
    /// konstruktor se ne deduje
    public void izpis(){
        System.out.println(ime); // spremelnjivke ki se dedujejo oz extendajo samo public in protected(mesana med eno in drugo)
    }
    // public IzredniStudent() {
    //     ime ="alenka";
    //     PovprecnaOcena =5;
    //     System.out.println(" konstruktor izrednega brez parametri");
    // }
    public IzredniStudent(String i ) {
        super(i); // klici konstr zs parametri posreduj ti konstrukterju super razreda.... mora bit prvi v stavku
        System.out.println(" konstruktor izrednega s parametri");
        
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ "\n Sem izredni student";
    }
    
}