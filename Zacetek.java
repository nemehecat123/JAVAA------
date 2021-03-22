public class Zacetek {
    public static void main(String[] args) {
        //naredi iz pravokotnika objekt
        Predmet rač=new Predmet();
        rač.ip1=34;
        rač.ip2=22;
        rač.interna=45;
        rač.ip1m=40;
        rač.ip2m=40;
        rač.internam=50;
        rač.ip1pr=40;
        rač.ip2pr=40;
        rač.internapr=20;
        System.out.println("Končno ocena točk "+rač.IzračunajŠteviloTočk());
    }
}
