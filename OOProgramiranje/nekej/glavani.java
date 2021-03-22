package nekej;

public class glavani {
    public static void main(String[] args) {
        // Delavec janez = new Delavec();
        // janez.setId(1231);  
        // janez.setIme("janez novak");
        // janez.setUrnaPostavka(123.4);
        // janez.setŠtUr(123);
        // janez.izpis();
        // LDelavec metka = new LDelavec();
        // metka.setId(32);
        // metka.setIme("metka stebeljova");
        // metka.setLetnaPlača(15000);
        // metka.izpis();

        // običajno
        Delavec[] vsi = new Delavec[100]; // new inicializira tebela 100 delavcev vsi elemenit pa majo 0 
        vsi[0]= new Delavec(); // vsi[0] je tipa delavec
        vsi[1] = new LDelavec(); // vsi[1] je tudi tipa delavec
        //inicializiran je kot LDelavec, klicala se bo metoda izpis 
        // razreda LDelavec, to je značilno za javo, ker ima neko
        // kasno vezanje (Late binding)

        UrniDelavec UD =new UrniDelavec();
        LetniDelavec LD =new LetniDelavec();
        UD.setId(123);
        UD.setIme("ficka");
        UD.setUrnaPostavka(13.2);
        UD.setŠtUr(120);
        UD.izpis();
        //------------------
        LD.setId(124);  
        LD.setIme("lolek");
        LD.setLetnaPlača(15000);
        LD.izpis();




    }
    
}
