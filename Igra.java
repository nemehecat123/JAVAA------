//import java.util.*;
import javax.swing.*;
;public class Igra {
    public static void main(String[]args) {
        Palcke p = new Palcke();
        //Scanner sc = new Scanner(System.in);
        //dokler ni konec igre
        JOptionPane.showMessageDialog(null, p.izpišiStanje1());
        while(!p.konecIgre()){   
            
            //  p.izpišiStanje();                           //izpiši stanje igre
            // System.out.println("koliko palck vzameš 1-3");                           //vprašaj igralca kolko palčk uzame
            String odgovor =JOptionPane.showInputDialog("koliko palck uzames 1-3");
            //int n =sc.nextInt();                              // ta scanner si upeljau samo za odvzem palčk.
            int n=Integer.parseInt(odgovor);
            if(p.vzemiPalčke(n)){//vzemi in izpiši če je vzetek uspel
                // System.out.println("vzel si "+n+" palck");
                JOptionPane.showMessageDialog(null,"vzel si "+n+" palck\n"  + p.izpišiStanje1());    // null jepozicija kjer se mora zapisat ta pane
            }
            else{
                JOptionPane.showMessageDialog(null,"ne slepari");             // System.out.println("ne slepari");
            }
        }//konec od while
        JOptionPane.showMessageDialog(null,"zmagal je igralec"+p.dobiZmagovalca());                // System.out.println("zmagal je igralec"+p.dobiZmagovalca()); // ko je konec igre izpiš zmagovalca
        
    }
}
