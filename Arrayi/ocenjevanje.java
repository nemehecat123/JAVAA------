public class ocenjevanje {
    private static int[] izpit=new int[10];
    private static int[] vaje=new int[10];
    public static double[] povOc= new double[2];
    public static int[] maxOcena=new int[3]; // 0 = izpiti , 1 = vaje , 3 =skupno
     static double [] std= new double[2];
    public static void main(String[] args) {    
        polni(izpit, vaje);
        
    }

    public static void polni(int[] a, int[] b) {
        for (int k =0;k<a.length;k++)
        {
            a[k]=(int )(Math.random()*11);

        }
        for(int k =0;k<a.length;k++){
            if (a[k]<5) {
                b[k]=0; 
            }
            else{
                b[k]=(int)(Math.random()*10);
            }
        }
        izpis(a);
        izpis(b);
        AnalizaOcen();
        DOUBLEizpis(povOc);
        




    }
    public static void izpis(int[] a)
    {
     for(int k=0;k<a.length;k++)
       {
           
         System.out.print(a[k]+"\t");
         
         }   
     System.out.println();
    }

    public static void DOUBLEizpis(double[] a)
    {
     for(int k=0;k<a.length;k++)
       {
           
         System.out.print(a[k]+"\t");
         
         }   
     System.out.println();
    }

    public static void AnalizaOcen(){   
        double povIZPIT =0.0;
        double povVAJE =0.0;
        double ŠtevecPozOcenVaje =0.0;
        for(int k =0; k<izpit.length;k++){  // za povprecno oceno izpitou
            if (izpit[k]>5) {
                povIZPIT =povIZPIT+izpit[k];
                ŠtevecPozOcenVaje++;
            }
        }
        povIZPIT =povIZPIT/ŠtevecPozOcenVaje;
        povOc[0] = povIZPIT;

        int ŠtevecPozOcen =0;
        for(int k =0; k<vaje.length;k++){  // za povprecno oceno izpitou
            if (vaje[k]>5) {
                povVAJE =povVAJE+vaje[k];
                ŠtevecPozOcen++;
            }
        }
        povVAJE =povVAJE/ŠtevecPozOcen;
        povOc[1] = povVAJE;


        int index =0;
       
        for(int k =0;k<izpit.length;k++){
            if (izpit[index]>izpit[k]) {
                
                index=k;
            }
        }
        System.out.println(index);
        


    }

}
