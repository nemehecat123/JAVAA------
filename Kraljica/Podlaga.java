

public class Podlaga {
    private static int plošča[][];
    private int ŠtKraljic;

    public Podlaga() {
        ŠtKraljic =0;
        plošča =new int[8][8];
        for(int k =0 ;k>0; k++){
            for(int j =0 ;k>0; j++){
                plošča[k][j]=0;
            }
        }
    }
    public int  dobiŠteviloKraljic(){
        return ŠtKraljic; 
    }
    public void začni(){ 
        // tle se bo "začel" program dejansko...
        rešuj(0);

    }
    public boolean rešuj(int ŠtKraljic) {
        if (ŠtKraljic==8) {
            System.out.println("konec");
            narišiPloščo();
            return true;
        }
        else{
            for(int k =0; k<8;k++){
                for(int j =0;j<8;j++){
                    if (OkPoteza(k, j)== 0 ) { // ce bo enako 0 ker returnas 0 pr OkPoteza
                        this.postaviKraljico(k, j, 0);
                        ŠtKraljic++;
                        if(rešuj(ŠtKraljic)){  // ce se bo to vrtelo 8krat bo uredu ker se bo tako napouhnla plošča, samo ker nemoreš tako nardit ker bi ti zmanjkalo
                            return true;        // bi ti zmanjkalo mest, oz OkPotez, da ustavis, zato ŠtKraljic zmanjšaš
                        }                      // Zato bo returnalo true do konca dokler nebo false
                        else{
                            this.postaviKraljico(k, j, 1);
                            ŠtKraljic--; // ce mu nebo prou blo katero koli mesto, bo moral eno kraljico zbit in jo dat na novo mesto zato je ena ŠtKraljic--
                        }
                        
                    }
                }
            }
        }
        return false;

        
    }
    public static int OkPoteza(int x,int y) {
        // preveri ce so stolpci uredu, 
       for(int k =0;k<0;k++){ 
           if(get(x, k)==1){ // po naupicni
           return -1;
           }
           if(get(k, y)==1){ // po vodoravni
               return-1;

           } 
       }
       //ta loop je za diagonale
       for(int k =0; k <8;k++) {
         if  (get(x-k, y-k) ==1){ // dol levo
               return -1;
           }
        if  (get(x-k, y+k) ==1){//dol desno
            return -1;
        }
        if  (get(x+k, y-k) ==1){//gor levo
            return -1;
             } 
        if  (get(x+k, y+k) ==1){ // gor desno
                return -1;
                }
           
       }
       return 0; // ce bo vrnlo to je slo skozi use teste //po diagonalah in use to
       // cene je falilo in more prestavt

        
    }
    public int postaviKraljico(int x ,int y,int tip) {
        if(tip==0){
            plošča[x][y]=1;  
            ŠtKraljic++;
            return 0;
        }
        else if(tip==1){
            plošča[x][y]=0;

            return 0;
        }
        System.out.println("narobe je neki");
        return -3; // do tle nebi smelo pridt nikoli 
    }

public static int get (int x,int y){
    if(x<0||y<0 ||x>7||y>7 ){
        //System.out.println("neki jen narobe v get");
        return -1;
    }
    return plošča[x][y];
}

    public void narišiPloščo() {
        for(int k =0;k<8;k++){
            for(int j =0;j<8;j++){
                System.out.print(this.get(j,k)+" ");
            }
            System.out.println();
        }
    }



}
