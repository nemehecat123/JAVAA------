public class Vaja6b {           
    public static void main(String[] args) {
        double miles;
        double kilometers;
        double miles2;
        double kilometers2;
        System.out.println("miles\tkilometer\tmiles\tkilometers\n");
        for(int k=0;k<11;k++){
            miles =k;
            miles2 =k+10;
            kilometers2=miles*1.609+16.09;
            kilometers =miles*1.609;
            // System.out.println(miles);
            // System.out.println(kilometers);
            // System.out.println("miles\tkilometer\tmiles\tkilometers\n");

            System.out.println(miles+ "\t"+kilometers+"\t\t"+miles2+ "\t"+kilometers2);
        }
    }
}
