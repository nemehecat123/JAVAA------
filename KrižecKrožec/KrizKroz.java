import java.util.*;


public class KrizKroz
{
            static ArrayList<Integer> plajer1Position =new ArrayList<>();
            static ArrayList<Integer> plajer2Position =new  ArrayList<Integer>();
        public static void main(String[] args) 
        {
            char [][] igralnaPlošča ={{' ','|',' ','|',' '}, // igralna plošča
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '}};
            while(true)
            {
                Scanner sc =new Scanner(System.in);
                System.out.println();
                System.out.println(" vnesi pozicijo kjer hoces dat.... pozicije grejo tako\n1 2 3\n4 5 6\n7 8 9");
                System.out.println();
                IzrišiPloščo(igralnaPlošča);
                int pozicijaPlayer1 =sc.nextInt();  
                
                while (plajer1Position.contains(pozicijaPlayer1)|| plajer2Position.contains(plajer1Position)) 
                {
                    System.out.println("pozicija je zasedena !... vnesi drugo pozicijo.");
                    pozicijaPlayer1= sc.nextInt();
                }


                mestoŠtevilke(igralnaPlošča, pozicijaPlayer1, "plajer 1");  // mesto kjer bos hotu upisat cifro
                String rezultat= PoglejZmagovalca();
                if(rezultat.length()>0){
                    System.out.println(rezultat);
                    break;
                }
                IzrišiPloščo(igralnaPlošča);  
                int pozicijaPlayer2 = sc.nextInt(); 
                String rezultat1= PoglejZmagovalca();
                if(rezultat.length()>0){
                    System.out.println(rezultat1);
                    break;
                }
                while (plajer1Position.contains(pozicijaPlayer2)|| plajer2Position.contains(pozicijaPlayer2))
                {
                    System.out.println("pozicija je zasedena !... vnesi drugo pozicijo.");
                    pozicijaPlayer2= sc.nextInt();
                }
                mestoŠtevilke(igralnaPlošča, pozicijaPlayer2, "plajer 2");
                IzrišiPloščo(igralnaPlošča);
                System.out.println();
                // // String rezultat= PoglejZmagovalca();
                // if(rezultat.length()>0){
                //     System.out.println(rezultat);
                //     break;
                // } 
                // System.out.println(rezultat);         
            }  
        }








        public static void IzrišiPloščo(char[][] igralnaPlošča) {
            for(char[] vrsta:igralnaPlošča) // za vsako vrstovrsto u plošči bo nardilo next line...
            {
               for (char h:vrsta) // za vsak character ki je v tej trenutni vrsti ki ga bo doiblo od prej
                {  
                System.out.print(h);    // nej napise ta character... nej napise abc... gre u drugo vrsto dfe...
                }
            System.out.println(); // to je ta next line
            }
        }
        public static void mestoŠtevilke(char[][] igralnaPlošča,int pozicija,String user) {
                    char symbol = ' ';
                if (user.equals("plajer 1")) {
                    symbol ='X';
                     plajer1Position.add(pozicija);
                }
                else if (user.equals("plajer 2")) {
                    symbol ='o'; 
                    plajer2Position.add(pozicija);
                   
                }
            switch (pozicija) {
                case 1:
                igralnaPlošča[0][0]=symbol;
                break;
                case 2:
                igralnaPlošča[0][2]=symbol;
                break;
                case 3:
                igralnaPlošča[0][4]=symbol;
                break;
                case 4:
                igralnaPlošča[2][0]=symbol;
                break;
                case 5:
                igralnaPlošča[2][2]=symbol;
                break;
                case 6:
                igralnaPlošča[2][4]=symbol;
                break;
                case 7:
                igralnaPlošča[4][0]=symbol;
                break;
                case 8:
                igralnaPlošča[4][2]=symbol;
                break;
                case 9:
                igralnaPlošča[4][4]=symbol;
                break;
            }
        }
        public static String PoglejZmagovalca(){

                List zgornjaVrsta = Arrays.asList(1,2,3);
                List srednjaVrsta = Arrays.asList(4,5,6);
                List spodnjaVrsta = Arrays.asList(7,8,9);
                List leviStolpec = Arrays.asList(1,4,7);
                List srednjiStolpec = Arrays.asList(2,5,8);
                List desniStoplpec = Arrays.asList(3,6,9);
                List DiagonalnoDLS = Arrays.asList(1,5,9);
                List DiagonalnoLDS= Arrays.asList(3,5,7);

                List<List> zmagovalniPogoji =new ArrayList<List>();
                zmagovalniPogoji.add(zgornjaVrsta);
                zmagovalniPogoji.add(srednjaVrsta);
                zmagovalniPogoji.add(spodnjaVrsta);
                zmagovalniPogoji.add(leviStolpec);
                zmagovalniPogoji.add(srednjiStolpec);
                zmagovalniPogoji.add(desniStoplpec);
                zmagovalniPogoji.add(DiagonalnoDLS);
                zmagovalniPogoji.add(DiagonalnoLDS);
                
                for( List l :zmagovalniPogoji)
                
                {
                if(plajer1Position.containsAll(l)){
                    return "ZMAGA PLAJER 1";
                    
                }
                else if(plajer2Position.containsAll(l)){
                    return "ZMAGA PLAJER 2";
                    
                } 
                else if(plajer1Position.size()+plajer1Position.size()==9){
                    return "IZENAČENO";
                }
            }
            return "";
        }


}