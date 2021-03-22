public class NovAvto {
    public static void main(String[] args) {
        double cenaAvta =20000;
        double cenaSKreditom;
        for (int om=8;om<=11;om++){
            System.out.print("\t"+om+"\t");
        }
        System.out.println("\n");
        //vse ostale vrstice
        for (int leto =2;leto<=8;leto++){
            System.out.print("\t"+leto +"\t\t");
            for(int om=8;om<=11;om++){
                cenaSKreditom=cenaAvta*Math.pow(1+om/(100.0*365),leto*365);
                // System.out.print("\t\t"+cenaSKreditom+"\t");
                System.out.printf("     %8.2f    ",cenaSKreditom);
            }
            System.out.println();
        }
    }
    
}
