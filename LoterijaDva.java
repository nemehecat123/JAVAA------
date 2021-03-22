
public class LoterijaDva {
    public static void main(String[] args) {
        
        int x =1;
        int y =x++;   // tukej bo prvo y spremenilo v x in potem se bo x povečal za ena
        System.out.println(x);
        System.out.println(y);
        System.out.println("_____________________________");


        int g =1;
        int h =++g;   // tukej bo prvo g povečou za ena in pol se bo se h prepisou v g.... pol bo rezultat g=2 h =2
        System.out.println(g);
        System.out.println(h);
        System.out.println("-_________________--");

        int f = 4;
        //f = f +2;... to je isto napiano kukr odspodej samo krrajse in lepse
        f+= 2 ;
        System.out.println(f);
        
        System.out.println("------------------");
        double z =6.9;
        int k = (int)z+3; // tisti (int) nardi to, da spremenljivko z, ki je prej double spremeni v int in je cela stevila ne pa decimalna. PS zaokrizi vedno vedno dol
        System.out.println(k);
        System.out.println("--------------------");
        String s = "1";
        int t=  Integer.parseInt(s)+2;    //  Integer.parseInt(s) to nardi to, da string s pretvori v int!!!   ce je decimalna stevilka das float alpa Double.parse.Double(s)
        System.out.println(t);
        System.out.println("-------------------");
    
        int loto = Math.max(f, x);
        double loto2= Math.round(Math.random()*383);     // lahko das u oklepaj ce hoces , da ne delas 2 spremenljivk in se ti samo to prevede ze noter...
        int loto3= (int)Math.round(Math.random()*383);   // pred usem tem lahko das u oklepaj (int), da ti vrze vn cifro ki bo iz classa integer ne pa double.
        System.out.println(loto);
        System.out.println(loto2);
        System.out.println(loto3);
    }
        

        
    }

