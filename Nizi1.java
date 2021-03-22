

public class Nizi1 {
        public static void main(String[] args) {
            System.out.println( PetČrk("Danes je deževen dan"));
        }

        public static String PetČrk(String s){
            StringBuffer sb= new StringBuffer();
            
            for(int k =0; k<sb.length();k++){ // namesto 7 das lenght
                char znak = s.charAt(k); // definiramo presledek da ga bo iskalo noter u nizi
                if (znak==' '){
                    sb.replace(sb.indexOf(" "),sb.indexOf(" ")+1,""); 
                }    
            } 
            
            int pozicija =5;
            sb.insert(pozicija," ");
            // StringBuffer sb= new StringBuffer();
            // for (int z=0;z<s.length();z++){
            // if(s.charAt(z)!= ' '){
            //     sb.append(s.charAt(z));
            // }
            
            // StringBuffer rezultat =new StringBuffer();
            // for(int k=0;k<sb.length();k++){
            //     if(k%5==0&& k!=0);
            //     rezultat.append(" ");
            //     rezultat.append(sb.charAt(k));
                
            // }
           

            return ""+sb;

        }



}
