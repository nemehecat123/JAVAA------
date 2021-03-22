public class naloga1 {
    public static void main(String[] args) {
        int[][]mesci = new int [12][28];
        NajvisjaTemperatura(mesci);

    
    }
    public static void NajvisjaTemperatura(int[][] mesci){

        
        for (int k =0 ; k<12;k++){
            for(int j =0;j<28;j++){
                mesci[k][j]=(int)(Math.random()*35);
            }
        }

        for (int k =0 ; k<12;k++){
            for(int j =0;j<28;j++){
                System.out.print(mesci[k][j] + "|  ");
            }
            System.out.println();
            System.out.println();
        }

        int indexMAXMesca=0;
        int MAXTemperatura =0;
        // pejdi skozi tabelo in poglej za najvišjo temperaturo
        for (int k =1 ; k<12;k++){
            for(int j =0;j<28;j++){
                if (mesci[k][j]<MAXTemperatura);
                indexMAXMesca =k;
                
            }
        }
        
        System.out.println("\n\n"+indexMAXMesca);
        switch (indexMAXMesca) {
            case 1:
                System.out.println("januar");
                break;
                case 2:
                System.out.println("februar");
                break;
                case 3:
                System.out.println("marc");
                break;
                case 4:
                System.out.println("april");
                break;
                case 5:
                System.out.println("maj");
                break;
                case 6:
                System.out.println("junij");
                break;
                case 7:
                System.out.println("julij");
                break;
                case 8:
                System.out.println("august");
                break;
                case 9:
                System.out.println("september");
                break;
                case 10:
                System.out.println("oktober");
                break;
                case 11:
                System.out.println("november");
                break;
                case 12:
                System.out.println("december");
                break;
        
            default:
                break;
        }
    }
}