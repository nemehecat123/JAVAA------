import java.util.Scanner;
public class Vaja6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int KolkokratSePoveča=0;
        double koncnostevilo=0;
        double konce;
        double a =1;
      while (a>0){
          System.out.println("napisi stevila");
          double b =sc.nextDouble();
          if (b>0){
              KolkokratSePoveča++;
              koncnostevilo=koncnostevilo+b;
            
          }
          else{
            konce=koncnostevilo/KolkokratSePoveča;
            System.out.println(konce);
              break;
              
          }
          
      }
      
 
    

        
       
       
       
       


        sc.close();

    }
}










