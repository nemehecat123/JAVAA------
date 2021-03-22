public class Predmet 
//lasnosti
{
    double ip1;
    double ip2,interna;
    double ip1m,ip2m,internam;
    double ip1pr,ip2pr,internapr;
    public double IzračunajŠteviloTočk()
    {
     return ip1/ip1m*ip1pr 
     +ip2/ip2m*ip2pr
     +interna/internam*internapr;
    }
}


