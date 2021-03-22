public class raznaRekurzija {
    public static void main(String[] args) {
        // mystery(5);
    //    System.out.println(delej(2, 0)); 
    //     System.out.print(stejNazaj(20));
        poljubno(11,3);
        }
    
    public static void mystery(int n) {
        System.out.println(n);
        if (n<=5)
        mystery(n-1);
    }
    public static int delej(int n, int a) {
        if (n==0)
        return 1;
        else{
            return a*delej(n-1, a);
        }
    }
    // public static int stejNazaj(int a) {
    //     if(a==0)
    //     System.out.println("konec");
    //     else{
    //         System.out.println(a);
    //        return stejNazaj(a-1);
    //     }
    // }
    public static void poljubno(int p, int r){    //p je stevilko , ki ga hoces pretvorit v stistem r
        
        if (p/r==0)
        System.out.print(p%2);
        else{
          poljubno(p/r,r);
         System.out.print(p%r);
        }

    }
}
