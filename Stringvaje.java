public class Stringvaje {
    public static void main(String[] args) {
        // String  str1 ="";
        // String str2 = "stop";
        // String str3 = str1+str2;
        // int m =5;
        // int n =10;
        // String s1="51";
        // String s2 ="75";
        // int j =m+n;
        // int k = m + Integer.parseInt(s1);
        // int i =Integer.parseInt(s1)+Integer.parseInt(s2);
        // System.out.println(j+"___"+k+"___"+i);

        // String s5 = "Java, java, java";
        // s5.length();
        // System.out.println(s5.length());
        // System.out.println(s5.indexOf('a'));
        // System.out.println(s5.lastIndexOf('a'));
        // System.out.println(s5.indexOf("av"));   
        // System.out.println(s5.indexOf('a',5));
        // System.out.println(s5.lastIndexOf('a',5));
        // System.out.println(s5.indexOf("av",s5.length()-10));
        // System.out.println(s5.indexOf("a",s5.indexOf("va")));   

        System.out.println( iskanje("Java, Java, Java", "Java"));
        String x ="java java java".substring(5); //od uključno od 5 znaka naprej bo pogleadlo
        System.out.println(x);
        x="Java, Java Java".substring(5, 9);  // od 5 uklučno 9-1 pozicije
        System.out.println(x);
        

    }
    public static String iskanje (String s, String ključ){
       
        StringBuffer pozicije=new StringBuffer("");
        int index =s.indexOf(ključ,0);
        int št =0;

        while (index!=-1){
            pozicije.append(index +", ");
            št++;
            index++;
            index = s.indexOf(ključ, index);
        }
        //return št + "; "+pozicije;
        return pozicije.toString();
        }

    }

