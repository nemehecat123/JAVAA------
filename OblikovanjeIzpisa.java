//import java.util.Scanner;
public class OblikovanjeIzpisa {
    public static void main(String[] args) {
        int kolikokrat=3;
        System.out.println("dobro jutro"+ kolikokrat+" krat");
        System.out.printf("dobro jutro %d krat%n",kolikokrat);// ta procent d je format
        //%s nizi, %d cela stevila ,%f realna stevilaž
        // Scanner sc = new Scanner(System.in);
        // System.out.println("kako ti je ime");
        // String ime = sc.nextLine();
        // System.out.printf("pozrdavljen , %s!,",ime);
        int x=12345;
        System.out.println("brez formata  "+x);
        System.out.printf("z formatom   %10d%n",x);//lahko das na kolko mest izpiše stevilo
        System.out.printf("z formatom   %2d%n",x);
        int y =12;
        System.out.printf("desetiško : %10d,drugo število %10d%n",y,x);
        System.out.printf("osmiško : %10o%n",y);
        System.out.printf("šestnajtiško : %10x%n",y);
        double realno =-12345.6789;
        System.out.printf("realno : %+10.2f%n", realno);
        //%[zastavica][dolžina][natančnost]črka
        //zastavica + izpisuj redznak,^velike črke, 0 vodilne ničle
        System.out.printf("realno : %010.2f%n", realno);





        //definiraj si 5 spremenlivk

    }
}
