import java.util.Scanner;

public class Liga {
    Ekipa[] prvesntvo = new Ekipa[10];
    int x =0;
    int y =1;
    int[] gor ={2,3,4,5};
    int[] dol ={9,8,7,6};
    int[][] pari =new int [10][10];
    public void napolniPare(int kolo){
        pari[x][y] =kolo;
        for (int k =0; k<4;k++){
            pari[gor[k]][dol[k]]=kolo;
        }
        pari[gor[0]][dol[0]]=kolo;
        // zavrti 
        int temp=y;
        y =dol[0];            // enga kdr nardis ga lahko povozis
        dol[0]=dol[1];
        dol[1]=dol[2];
        dol[2]=dol[3];
        dol[3]=gor[3];
        gor[3]=gor[2];
        gor[2]=gor[1];
        gor[1]=gor[0];
        gor[0]=temp; 


    }
    public void napolniPare(){
        for (int kolo=1 ;kolo<=9;kolo++){
            napolniPare(kolo);
        }
    }

    public void izpišiTurnir(){
        napolniPare();
        for (int kolo=1;kolo<=9;kolo++){  // za vsako kolo
            System.out.println("-------------------------");
            System.out.println("pari "+ kolo+" . kola");
            System.out.println("-------------------------");
            // izpiši šare tega kola
            for (int k =0;k<10;k++) // preglej use vrstice in lalal
            {
                for(int j=0;j<10;j++)
                {
                    if (pari[k][j]==kolo)
                    {
                        System.out.println(prvesntvo[k].ime + " : "+prvesntvo[j].ime);
                    }
                }
            }
        }
    }

    public void inicializacija(){
        prvesntvo[0]=new Ekipa("italija");
        prvesntvo[1]=new Ekipa("škotska");
        prvesntvo[2]=new Ekipa("irksa");
        prvesntvo[3]=new Ekipa("Španija");
        prvesntvo[4]=new Ekipa("Nemčija");
        prvesntvo[5]=new Ekipa("Anglija");
        prvesntvo[6]=new Ekipa("Francij");
        prvesntvo[7]=new Ekipa("Portuga");
        prvesntvo[8]=new Ekipa("finska");
        prvesntvo[9]=new Ekipa("Belgija");

    }

    public void izpis(){
        System.out.println("ekipa\t\tŠt.točk\t Število tekem");
        System.out.println("------------------------------------");
        for (int k =0;k<10;k++){
            prvesntvo[k].izpis();
        }
    }
 public void obdelajRezultat(int kolo){
     Scanner sc= new Scanner(System.in);
     for (int k =0;k<10;k++)
     {
         for (int j =0;j<10;j++)
         {
            if (pari [k][j]==kolo){
                System.out.println(prvesntvo[k].ime + " ; "+ prvesntvo[j].ime+ " ");
                String rezultat= sc.nextLine(); //2:3
                int poz= rezultat.indexOf(":");
                int a = Integer.parseInt(rezultat.substring(0, poz) );
                int b =Integer.parseInt(rezultat.substring(poz+1));
                prvesntvo[k].vnesiRezultat(a, b);
                prvesntvo[j].vnesiRezultat(b, a);

            }
         }
     }
     sc.close();
 }

}
