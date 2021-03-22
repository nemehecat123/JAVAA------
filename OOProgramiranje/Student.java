

public class Student{
    protected String ime;  // to je atribut kao-- dodamo lastnost   --> enkapsulacija / ograjevanje
    protected double PovprecnaOcena;
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "sem študent  "+ime +"\n Moje povprečje je "+ PovprecnaOcena;
    }
    
    public Student() { // konstruktor služe temu da dodajas vrednosti svojim spremenljivkam
        
        ime ="";
        
        PovprecnaOcena =0.0;
        System.out.println(" konstruktor studenta brez parametrou");
    }
    public Student(String i ) {
        ime =i;
        PovprecnaOcena=0;
        System.out.println(" konstruktor študenta z parametrom i ");

    }





    // ker das beseda private
    // to lahko das samo ce niso lokalne sptremenjlivke


     // get in sett metodda za ime  
     // rabi isti podatkovni tip kot  ime

     public String getIme(){
         return ime ;
     }
     // zdej to je samo dostop spremeljivke v drugih razmerah
     // običajen 
     public void setIme(String i){
         if (i.length()>=20) {
             ime =i;
         }
         else{
             ime ="";
         }
         ime =i;
     }

    //  public double getPovprecnaOcena() {
    //      // izaračunaj povprečno oceno
    //      int vsota =0;
    //      for(int i =0;i <10 ;i++){
    //          int ocena = (int)(Math.random()*10+1);
    //          vsota +=ocena;

    //      }
    //      return vsota /10.0;
    //  }

     public void setPovprecnaOcena(double povprecnaOcena) {
         PovprecnaOcena = povprecnaOcena;
     }

     public double getPovprecnaOcena() {
         return PovprecnaOcena;
     }


     

    //  public void setPovprecnaOcena(double povprecnaOcena) {
    //      PovprecnaOcena = povprecnaOcena;
    //  }
     
 



}