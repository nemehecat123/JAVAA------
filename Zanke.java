import java.util.Scanner;
public class Zanke {
    public static void main(String[] args) {
       //program, ki izpiše račun za množenje
       Scanner sc=new Scanner(System.in);
       int pravilni=0;
       int napačni=0;
       for (int k=0;k<10;k++){
       int prvoŠtevilo= (int)(Math.random()*10+1);
       int drugoŠtevilo= (int)(Math.random()*10+1);
       System.out.println("kolko je "+ prvoŠtevilo+ " krat"+drugoŠtevilo);
        int odgovor =sc.nextInt();
        if (odgovor== prvoŠtevilo*drugoŠtevilo){
            // System.out.println("bravo");
            pravilni++;
        }
        else{
            System.out.println("zgrešil si");
            napačni++;

        }
    }
    System.out.println("pravilno si imel "+pravilni+" /10");
    System.out.println("napačno si imel "+napačni+" /10");
    sc.close();   
}

}
