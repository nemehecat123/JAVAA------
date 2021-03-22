public class Zanke1 {
    public static void main(String[] args) {
        // for (int k=0;k<100;k++)
        // System.out.println("zijo");



    //        int vsota=0;
    //        for (int k=0;k<1000;k++){
    //            vsota=vsota+k;
               
    //        }
    //        System.out.println(vsota);

    // }



    // boolean delej=true;
    // while(delej==true)
    // System.out.println("lolol");


        // for (int k=0;k==1;k++)
        // System.out.println("se nič ne izpiše");


        // for(int k=2;k<5000;k=k+2)
        // System.out.println(k);

        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // for (int k=1;k<=10;k++)
        // {
        //     System.out.print("\t"+k);

        // }
        // for(int k=1;k<=10;k++){ // k šteje vrstice
        //     System.out.print(k+"\t");
        //     for(int j=1;j<=10;j++)//šteje stolpce
        //     {
        //         System.out.print((k*j+"\t"));
        //     }
        //     System.out.println();
        // }

        double vsota =0;
        int predznak =1;
        for (int k=1;k<=200;k=k+2){
         double člen = 1.0/k*predznak;
         predznak=(-1)*predznak;
         vsota= vsota+člen;
        }
        System.out.println("pi je "+Math.PI);
        System.out.println("izračunana je "+vsota*4);
        
}
}
