import java.util.*;

public abstract class Sifra {
    public abstract String kodiraj (String s); // kodira eno besedo
    public abstract String dekodiraj(String s);//dekodira eno besedo
    public String encrypt(String s) // kodira selo besedo 
    {
        StringBuffer sb = new StringBuffer();
        StringTokenizer besede = new StringTokenizer(s);
        while (besede.hasMoreTokens()) {
            sb.append(kodiraj(besede.nextToken())+"   ");
            
        }



        return sb.toString();

    }
    public String decrypt(String s) // kodira selo besedo 
    {
        StringBuffer sb = new StringBuffer();
        StringTokenizer besede = new StringTokenizer(s);
        while (besede.hasMoreTokens()) {
            sb.append(dekodiraj(besede.nextToken())+"   ");
            
        }



        return sb.toString();
}
}