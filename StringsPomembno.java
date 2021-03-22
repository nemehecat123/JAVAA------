public class StringsPomembno {
    public static void main(String[] args) {
        String s =new String("sokratees kij e filozofirau");
        System.out.println(s.length());
     // iskanje posameznih znakov , izpis posameznega znaka v nizu

     char a =s.charAt(0);
     System.out.println(a);
     a=s.charAt(s.length()-1); // poglej char... ki je na dolzini lenght... lenght je 8 in pol ti napise pac kao 8 wstevilko zato pride na pol
     System.out.println(a);  // minus ena je zato ker se zacne z nic
     for (int k =0; k<s.length();k++){
     System.out.println(s.charAt(k));
     }
     // iskanje znaka v nizu....
     int pozicija = s.indexOf('k');
     System.out.println(pozicija);
     //poišči use k -je
     for (int k =0 ;k<s.length();k++){
     if(s.charAt(k)=='k')
     System.out.println(k+"  ");
     }
     int p1 =s.indexOf('k',3);  // druga stevilka pove odd katere stevilkke naprej isce
     // druga možnost za vse k je poiskat

     int p2 =s.indexOf('k');
     while(p2!=-1){
         System.out.println(p2);
         p2 =s.indexOf('k', p2+1);

     }
     // poišči kratees
     System.out.println(p1);


        int p3 =s.indexOf("kratees");
     System.out.println( "iskanje dela niza "+p3 );
     
    }
    
    
}
