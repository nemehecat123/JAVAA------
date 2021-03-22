

public class SpreminjanjeStevilk {
    public static void main(String[] args) {
        System.out.println("Kaj? To je besedilo! ... In kaj še????");
        System.out.println(odstrani("Kaj? To je besedilo! ... In kaj še????", 1));
        System.out.println(odstrani("Kaj? To je besedilo! ... In kaj še????", 0));


        // StringBuffer sb = new StringBuffer("Star je 6 let 6");
        // for(int k =0;k<sb.length();k++){
        //     switch (sb.charAt(k)) {
        //         case '1':
        //         sb.delete(k, k+1);
        //         sb.insert(k, "1");
        //         System.out.println(sb);
        //             break;
        //             case '2':
        //             sb.delete(k, k+1);
        //             sb.insert(k, "dva");
        //             System.out.println(sb);
        //             break;
        //             case '3':
        //             sb.delete(k, k+1);
        //             sb.insert(k, "tri");
        //             System.out.println(sb);
        //             break;
        //             case '4':
        //             sb.delete(k, k+1);
        //             sb.insert(k, "štiri");
        //             System.out.println(sb);
        //             break;
        //             case '5':
        //             sb.delete(k, k+1);
        //             sb.insert(k, "pet");
        //             System.out.println(sb);
        //             break;
        //             case '6':
        //             sb.delete(k, k+1);
        //             sb.insert(k, "šest");
        //             System.out.println(sb);
        //             break;
        //             case '7':
        //             sb.delete(k, k+1);
        //             sb.insert(k, "sedem");
        //             System.out.println(sb);
        //             break;
        //             case '8':
        //             sb.delete(k, k+1);
        //             sb.insert(k, "osem");
        //             System.out.println(sb);
        //             break;
        //             case '9':
        //             sb.delete(k, k+1);
        //             sb.insert(k, "devet");
        //             System.out.println(sb);
        //             break;
                    
        //           }  
                
                
        //         }
        
    }
    public static String odstrani(String s ,int n){
        //če je n1 odstrani na lihih
        //če je 0 ostrani na sodih
        StringBuffer sb =new StringBuffer();
        if(n==0){
            for(int k=0;k<s.length();k++){
                if(!(k%2==0&&s.charAt(k)!= ' ')) // ! če ni tako...
                sb.append(s.charAt(k));
            }
        }
        else{
            for(int k=0;k<s.length();k++){
                if(!(k%2==1&&s.charAt(k)!= ' '))  // ! če ni tako...
                sb.append(s.charAt(k));
            }
        }

        return sb.toString();

    }




}
