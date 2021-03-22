public class Mutant {
    String ime;
    int IQ;
    int moč;
    public Mutant(){
        ime = "neznano ime";
         IQ=0;
         moč=0;
    }
    public Mutant(String Xime,int XIQ,int Xmoč ){
        ime = Xime;
        IQ = XIQ;
        moč =  Xmoč;

    }
    public int izračunajKoeficient(){
        return IQ*moč;

    }
    public void izpišiVse(){
        System.out.println("ime "+ime);
        System.out.println("IQ"+IQ);
        System.out.println("moč"+moč);
    }
}
