public class Banka {
 double glavnica = 100;
 int leta =10;
 double ObrestnaMera = 0.05;
    public double letniObračun()
    {
        return   glavnica * (Math.pow(1+ObrestnaMera, leta));
        


    }
    public double dnevniObračun()
    {
        return glavnica * Math.pow(1+ObrestnaMera/365, 365* leta);
        
    }
     
    
    
}
