package nekej;

 public class Zival {
    protected String Vrsta;
    public Zival(){
        System.out.println("sem v razredu žival");
        }
        @Override
        public String toString() {
            return"sem "+Vrsta+" in delam"+((Igovor)this).govor();
        }
        // to da ti bodo tiste dedovane razredi , da bojo mogli dedovani razredi napisat kodo 
        //public abstract String govor(); // galva metoda brez kode

    }
