import javax.swing.*;
public class Vaja {
    public static void main(String[] args) {
        String vnos = JOptionPane.showInputDialog("vnesi stevilko"); //zmiri vrze string vn zato moraš v naslednji vrstici det parse int da ti spremeni.
        int stevilo =Integer.parseInt(vnos);
        if(stevilo==1)
        {
            System.out.println("vnesel si 1");
        }
        else{
            System.out.println("nisi vnesel ena");
            if (stevilo==2)
            {
                System.out.println("vnesels si 2");
                
            }
            else{
                if(stevilo==3){
                    System.out.println("vnesel si tri");
                }
                else
                {
                    System.out.println("nisi vnesel 3ne 1 ne 2");
                }
            }
        }
    
    }
}