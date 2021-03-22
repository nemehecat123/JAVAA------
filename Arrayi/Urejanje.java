import java.util.*;

public class Urejanje
{

    static int[] a;
    public static void main(String[] args) {
        // a ={6,24,80,4,19,84,1,10,13,7};
        a = new int[500000];
        polni(a);
        Calendar c =new GregorianCalendar();
        Date d =c.getTime();
        long ms =d.getTime();
        quicksort(0, a.length-1);
        Calendar c1 =new GregorianCalendar();
        Date d1 =c1.getTime();
        long ms1 =d1.getTime();
        System.out.println("quick "+(ms1-ms)+ " milisekund ");

        // izpis(a);
        // System.out.println("-------------------------------------------------------------------");
        // // Izbiranje(a);
        // IzbiranjeNajvečjega(a);
        // System.out.println("---------------------------------------------------------------");
        // Izbiranje(a);
        // vstavljanje(a);
        // bublos(a);
        // izpis(a);
       
    }

    public static int pivot(int zač,int konec){

        // razdeli tabelo na dva dela glede na pivotni element
        int p =a[zač];
        int m =zač;
        int n =konec+1;
        // m  poišči m prvega, ki je večji od pivota
        do {m=m+1;}while(a[m]<=p &&m<konec);
        // poišči prvega z n , ki je manjši od pibvota
        do{n=n-1;}while(a[n]>p);
        while(m<n)
        {
            int temp =a[m];
            a[m]=a[n];
            a[n]=temp;
        // m  poišči m prvega, ki je večji od pivota
            do {m=m+1;}while(a[m]<=p);
        // poišči prvega z n , ki je manjši od pibvota
        do{n=n-1;}while(a[n]>p);
        }
        // postavi pivot na n mesto
        int temp2 =a[n];
        a[n]=a [zač];
        a[zač]=temp2;
        //izpis(a);
        return n;
    
    }

    public static void quicksort(int zač,int konec){
        if (zač >=konec){
            return;
        }
        int zaDelitev =pivot(zač, konec);
        quicksort(zač, zaDelitev-1);
        quicksort(zaDelitev+1, konec);
    
    }
    public static void polni(int[] a) {
        for (int k =0;k<a.length;k++)
        {
            a[k]=(int )(Math.random()*50000);

        }
    }
    public static void Izbiranje( int [] a)
    {
        for (int k =0;k<a.length-1;k++)
        {
            // poišči njamanjši element od k dop konca tabele
            int min =a[k];
            int minIndex =k;
            for (int j =k+1;j<a.length;j++)
            {
                if (a[j]<min) 
                {
                    min =a[j];
                    minIndex =j;    
                }
            }
        // zamenjaj najmanjšega s prvim preostankom tabele
        int x =a[k];  // int x bo 80.... na a[k] mestu
        a[k]=a[minIndex];   // na mesto a[k] bo pršlo število j sepravi 0(recmo)
        a[minIndex]=x; // na mesto a[minindex] pride število x , ki je osemdeset... in to se ponovi 10krat...
            // izpis(a);   //
        }

    }
    public static void IzbiranjeNajvečjega(int[] a)
    {
        for (int k =0;k<a.length;k++) // tle gre skozi tabelo , in določi max in maxindex
        {
            int max =a[k]; //dobis stevilo max // u tem primeru 80
            int maxIndex =k; // dobi mesto steviloa max   // ta index od 80 bo na mestu 0
            for(int j =k+1;j<a.length;j++) // tle pejdi skozi tabelo   // tisti plus ena je ker prva je kao ze max cifra

            {     
                if (a[j]>max)  // če bo 3>80
                {
                    max=a[j];  // max stevilo spremeni v stevilo, ki je na a[j] mestu... (3 v tem priemru)
                    maxIndex=j;  // maxindex je stevilo na katerem dobi to max stevilo                    
                }
            }
            //tle bos zdej samo zamenjal prvo stevilko z zadnjo ? 

        int x =a[k]; // novo spremenljivko x das zato , da lahko spremenljivko a[k] spremenis... x =80
        System.out.println("zamenjata se stevili na mestu "+ maxIndex+" in "+ k);
        a[k]=a[maxIndex]; // tle bo ratou a[k] =  4¸
        a[maxIndex]=x; // a[maxindex] bo ratou 80
        // izpis(a);
        }

    }
    public static void izpis(int[] a)
{
 for(int k=0;k<a.length;k++)
   {
       
     System.out.print(a[k]+"\t");
     
     }   
 System.out.println();
}
    public static void vstavljanje(int[] a){




    for (int k =0;k<a.length;k++){
        // pogreznit kti element tako, da bo element od 0 do k urejenei
        int j=k;int temp =a[k];
        while(j>0&&a[j-1]>temp)
        {
            a[j]=a[j-1];
            j--;
        }
        // dobil sem mesto za element, ki ga vstavljam
        a[j] =temp;
        // izpis(a);
    }


}
    public static void bublos(int [] a) {   
    for(int j =0;j<a.length-1;j++){
        for(int i =0; i <a.length-1;i++){
            if(a[i]<a[i+1]){
                int temp =a[i+1];
                a[i+1]=a[i];
                a[i]= temp;
            }
        }
        // izpis(a);
    }
    
    
}
}
