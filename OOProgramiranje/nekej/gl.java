package nekej;

public class gl {
    public static void main(String[] args) {
        A a=new A();
        a.metoda();
        B b = new B();
        b.metoda();

        A c;  // to je deklaracija c  na višjem nivoju
        c = new B(); // inicializacija c kot objekt, ki deduje od A
        A d= new B();
        c.metoda();
        d.metoda();
        // metode v javi so vitrualne,
        // to pomeni da kdr spremenljivko ini  in je nekega razreda 
         // pol pride do nezga pojava -- >late binding/ kasno vezanje
        // nevirtualne metode se vežejo ob deklaraciji ne pa od inicializaciji. --> temu rečemo early binding.
        // polimorfizem... ena in ista metoda je v različnih oblikah
        // prvi princim je ograjevanje
        // drugi princip je dedovanje
        // tretji princip je polimorfizem.

        // NAROBE
        // B d=new A();  // to negre ker je A višje hierarhije.
    



      
        Krava murie = new Krava();
        System.out.println(murie.toString());

        Krava k = new Krava();
        System.out.println(k.toString());

        Igovor muri =new Pes();
        System.out.println(muri.toString());
        }
        //tako nemore bit, ker je abstrakten razred!!
        //Zival z =new Zival();
}
