public class VajeSPR {
     public static void main(String[] args) {
        
    int x =-123;
    int y=Math.abs(x);
    System.out.println(y);
    double z=Math.abs(3.5);
    System.out.println(z);
    System.out.println("metoda pow " + Math.pow(2,5));    //prvi osno va drugi potenco
    //int a = (int)Math.sqrt(4);
    System.out.println("metoda sqrt 4 " + Math.sqrt(4));
    System.out.println("ceil " + Math.ceil(2.7));
    System.out.println("ceil " + Math.ceil(2.1));
    
    System.out.println("flor"  + Math.floor(2.7));
    System.out.println("flor " + Math.floor(2.1));
    System.out.println("ceil " + Math.ceil(-2.7));
    System.out.println("ceil " + Math.ceil(-2.1));
    
    System.out.println("flor"  + Math.floor(-2.7));
    System.out.println("flor " + Math.floor(-2.1));
    System.out.println("round "  + Math.round(2.7));
    System.out.println("round " + Math.round(2.1));
    double b=2.34;
    double c = Math.round(b*100);
    System.out.println(c);
    double d= c/100;
    System.out.println(d);

}
}
