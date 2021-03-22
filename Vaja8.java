
public class Vaja8 {
    public void PretvoriVBinarno(int num){
        int binarno[] = new int[40];
        int index = 0;
        while(num > 0){
          binarno[index++] = num%2;
          num = num/2;
        }
        for(int i = index-1 ;i >= 0;i--){ //to je za se premikat po arrayu. (pac zanka s epremakne in izpise se stevilo....)
          System.out.print(binarno[i]);
        }
     }
    
     public static void main(String a[]){
       Vaja8 obj = new Vaja8();
        System.out.println("Binary representation of 123: ");
        obj.PretvoriVBinarno(123);
        System.out.println("\nBinary representation of 45: ");
        obj.PretvoriVBinarno(45);
        System.out.println("\nBinary representation of 999: ");
        obj.PretvoriVBinarno(999);
     }
   }