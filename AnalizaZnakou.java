public class AnalizaZnakou {
    public static void main(String[] args) {
        // // ŠteviloVelikih("Matevž Kavčič");
        // System.out.println( ŠteviloVelikih("Matevž Kavcickk"));
        String s ="oto knjigo uporabljamo od leta 2008/09 dalje.";
        char prvi =s.charAt(0);
        switch(prvi){
            case 'N':
            case 'n':
                 System.out.println(s);
            break;
            case 'O':
            case'o':
            //napisi okodo
            StringBuffer sb =new StringBuffer();
            System.out.print(sb.reverse().toString());
            for (int k=s.length()-1;k>=0;k--){
                System.out.print(s.charAt(k));
            }
            System.out.println();
            break;
            case 'P':
            case 'p':
            // koda ki uzame naslednji znak, če je črka malpa števka
            
            
            for(int i =0; i<s.length();i++){
                if (Character.isLetterOrDigit(s.charAt(i))){
                System.out.print((char)(s.charAt(i)+1));     
                if(s.charAt(i)=='9'){
                    i--;
                    System.out.print('0');
                    }       
                }
                else {
                if(s.charAt(i)=='9'){
                System.out.println("0");
                }
                System.out.print(s.charAt(i));
            }
            }

            break;
            case 'Z':
            case 'z':
            

            break;

        }
    
    
    
    
    
    
    
    
    
    
    
    
    }
    public static int ŠteviloVelikih(String s){
        int dolžina = s.length();
        int števec=0;
        for(int k =0;k<dolžina;k++){
            char znak =s.charAt(k);
            if (Character.isWhitespace(znak));
            {števec++;}
        }
        return števec;
    }



}
