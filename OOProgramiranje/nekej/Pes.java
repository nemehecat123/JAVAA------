package nekej;

public class Pes extends Zival implements Igovor{
    
    public Pes() {
        Vrsta ="pes";
    }

    @Override
    public String govor() {
        // TODO Auto-generated method stub
        return "how";
    }

    @Override
    public void a() {
        // TODO Auto-generated method stub
        
    }


    // ta koda je nujna, ker je uni class abstrakten, ce jo deduje!
    
    
}
