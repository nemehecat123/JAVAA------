public class Ime
{
    public static void main(String[]args)
    {
        
        System.out.println(jePalindrom("ana"));


    }
      public static boolean jePalindrom(String s){

        if(s.length()==0||s.length()==1)
         return true;
         char prva =s.charAt(0);
         char zadnja =s.charAt((s.length()-1));
         return prva==zadnja &&jePalindrom(s.substring(1,s.length()-1));


  }

    
}
