//import javax.swing.*;
public class Palcke {
    int štPalčk; // kolko je palčk na mizi
    int naVrsti; //1 al drugi igralec
    public Palcke() {
        štPalčk=7;
        naVrsti=1;

    }
    public boolean vzemiPalčke(int n)
    {
        if (n<1||n>3)
        return false;
        else
        {
            štPalčk=štPalčk-n;//vzemi palke
            naVrsti=3-naVrsti;//spremeni igralca
            return true;
        }
    }
    public boolean konecIgre()
    {
        return štPalčk<1;
    }
    public int dobiZmagovalca()
{
    return naVrsti;

}
// public void izpišiStanje()
// {
//     JOptionPane.showMessageDialog(null,"na mizi je tolko palčk : "+ štPalčk);            //System.out.println("na mizi je tolko palčk : "+ štPalčk);
//     JOptionPane.showMessageDialog(null, "na vrsti je "+ naVrsti);          //System.out.println("na vrsti je "+ naVrsti);
// }

public String izpišiStanje1()
{
    return "na mizi je tolko palčk : "+ štPalčk+ "\n Na vrsti je "+ naVrsti;            
          
}
}