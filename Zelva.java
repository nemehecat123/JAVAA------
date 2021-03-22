public class Zelva {
    double x;
    double y; //pozicija zelve
    int kot ;//glede na os x
    public Zelva(double x1, double y1,int kot1) {
        x=x1;
        y=y1;
        kot=kot1;
        // ta del kode samo pove kje zacne risat .... koordinatni sistem je 1/1
    }
    public void obratLevo(int alfa)
    {
        kot =kot+alfa;
    }
    public void obratpolni(){
        kot=kot+180;
    }
    public void obratDesno(int alfa) {
        kot =kot+alfa;
        
    }
    public void pomik (double d)
    {
        //premakni se v dani smeri za razdaljoi d
        double x0=x;
        double y0=y;
        x=x0+d*Math.cos(Math.toRadians(kot));
        y=y0+d*Math.sin(Math.toRadians(kot));
        StdDraw.line(x0, y0, x, y); // od kje so kje nariši črto
    }
}
