import java.util.*;
public class DeljenjeBesed {
    public static void main(String[] args) {
        String url ="http://java.trincoll.edu/~index.html";
        StringTokenizer st=new StringTokenizer(url,":/~.");
        // while (st.hasMoreTokens()){
        //     String x=st.nextToken();
        //     System.out.println(st.nextToken());
        // }
        // String n="to je prvotni niz        ";
         StringTokenizer s = new StringTokenizer(n);
        while (s.hasMoreTokens()){
            String x=s.nextToken();
            System.out.print(x+"#");
            
        }
        StringBuffer sb =new StringBuffer();
        while (s.hasMoreTokens())
        {
            String x =s.nextToken();
            sb.insert(0, x+" ");

        }
        System.out.println(sb.toString());
    }
}
