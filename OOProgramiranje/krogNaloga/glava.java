package krogNaloga;


public class glava {
    public static void main(String[] args) {
        Krog k =new Krog(1);
        Valj v =new Valj(3, 4);
        System.out.println(v.prostornina()+ " prostornina");
        System.out.println(v.površina()+" površina");
        System.out.println(k.ploščina() + " ploščina");
        System.out.println(k.obseg() +" obseg");

    }
    
}
