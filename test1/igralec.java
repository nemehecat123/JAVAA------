

public class igralec {
    public static void main(String[] args) {
        inicialke(" Ime Priimek Drugi");
    }
    public static void inicialke (String s){
        s = "Ime Priimek Drugi ";
       
        System.out.print(s.charAt(0)+".");
        for (int k =0;k<s.length()-1;k++)
        {
            if (s.charAt(k)== ' ') {
                System.out.print(s.charAt(k+1)+".");
            }
        }
        s.charAt(3);
        
      

    }
}
