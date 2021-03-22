import java.util.Scanner;
public class Vaja6c {
    // public static void main(String[] args) {
    //     String učenci[]=new String[1000];
    //     int ocena[]=new int[1000];
    //     Scanner sc=new Scanner(System.in);
    //     int a =1;
    //     while(a>0){
    //         učenci[0]=sc.nextLine();
    //         ocena[0]=sc.nextInt();
            
    //         if(učenci[0]=="0"){
    //             break;

    //         }
    //     }


    //     // učenci[1]=sc.next();
    //     // System.out.println( učenci [1]);
    // }


    public static void main(String[] args) {
        System.out.println("Vnesi imena dijakov in njihove ocene (vnesi 0 kot ime dijaka ko želite zaključiti).");
        Scanner input = new Scanner(System.in);
        int ocena = 0;
        String ime = "";
        boolean izpiši = false;
        while (true) {
            String tempIme = input.next();
            if (tempIme.equals("0")) {
                break;
            }
            int tempOcena = input.nextInt();
            izpiši = true;
            if (tempOcena > ocena) {
                ocena = tempOcena;
                ime = tempIme;
            }
        }
        if (izpiši) {
            System.out.println(ime + " je imel najvišjo oceno in sicer " + ocena);
        }
        input.close();
    }

}
