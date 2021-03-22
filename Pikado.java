public class Pikado {
    public static void main(String[] args) {
        // double randomSTx = Math.random();
        // double randomSTy = Math.random();
        // randomSTx =Math.round((randomSTx*100 ));
        // randomSTy =Math.round((randomSTy*100 ));
        int yinx=50;
        int Lihastevila =0;
        int Sodastevila=0;
        // double hipotenuza;
        

        // System.out.println(randomSTy); // tle pride od 1 -100
        // System.out.println(randomSTx);
        for (int i = 0; i < 100; i++) { 
            double randomSTx = Math.random();
            double randomSTy = Math.random();
            randomSTx =Math.round((randomSTx*100 ));
            randomSTy =Math.round((randomSTy*100 ));
            
                
          

            
            if ((randomSTx <= 50) & (randomSTy <= 100)) { // če bo kvadrat 1
                // System.out.println("stevilo je liho");
                Lihastevila++;
            }
            if ((randomSTx >= 50) && (randomSTy <= 50)) { //če bo kvadrat 4
                // System.out.println("točka pade v sodem številu");
                Sodastevila++;
            }
            if (((randomSTx>yinx)&&(randomSTy>yinx))){        // ČE BO KVADRAT 2 ALPA 3
                double triALIdva =randomSTx +randomSTy;
                 if (triALIdva>50){
                     Sodastevila++;
                 }  
                 else {
                     Lihastevila++;
                 }

                }
        }
        System.out.println("sodo stevilo pade "+Sodastevila+" krat");
        System.out.println("liho stevilo pade " + Lihastevila+" krat");




    }   
}
