import java.awt.Color;

import javax.swing.plaf.ColorUIResource;

public class FraktelGeom {
    public static void main(String[] args) {
   
        //    Zelva z = new Zelva(0.5,0, 40); // postavitev  kam ga das
        //    drevo(3, z,0.2);

        //    Zelva z2 =new Zelva(0.5, 0,  140);
        //    drevo2(3, z2, 0.2);

        //    Zelva z3 =new Zelva(0.1,0.5, 0);
        //    antena(2,0.3, z3);
            
        // Kompleksno a=new Kompleksno(1, 1);
        // Kompleksno b =new Kompleksno(-2, 3);
        // Kompleksno c = a.plus(b);
        // c.izpiši();
        // System.out.println("seštevanje");
        // c=a.krat(b);
        // c.izpiši();
        // System.out.println("množenje");
        // System.out.println("abolutno od 1+i "+ a.absolutna());
        // System.out.println("abolutno od -2+3i "+ b.absolutna());
        //  Kompleksno z = new Kompleksno(1, 0.5);
        //  System.out.println("število korakov "+ mandelbrot(z, 255));
        double xc =0.33593;
        double yc =0.062;
        double velikost =0.002;
        int n =512;
        Picture pic = new Picture(n,n);   // piksli kako veliko bo
        Color barva;
        
        for (int i =0;i<n;i++){
            for(int j =0 ;j<n;j++){
                double x0 =xc-velikost/2+velikost*i/n; // preslikava med ravnino slike in kompleksno ravnino
                double y0 =yc-velikost/2+velikost*j/n;
                Kompleksno z0 = new Kompleksno (x0,y0);
                int t=255-mandelbrot(z0, 255);
                barva = new Color(t,t,t);
                pic.set(i, n-1-j,barva );
            }
        }
        pic.show();
    
    
    
    
    
    
    }

    public static int mandelbrot (Kompleksno z0, int max){
        //računanje zaporedje z(i+1)=z(i)*z(i)+z0,
        //dokler ni abolutna vrednmost z(i) več od dva
        //ali smo nardili več klorakov
        Kompleksno z =z0;
        for (int t =0;t<max;t++){
            if(z.absolutna()>2) return t;
            z=z.krat(z).plus(z0);
        } 
        return max;
    }





















        public static void drevo (int n, Zelva z, double korak){
            //  StdDraw.setPenRadius(0.09*Math.pow(n-1,0.02));          
            // StdDraw.setPenColor(Color.yellow);
            Color c=new Color(n,255-50*n,0); // red green blue
            StdDraw.setPenColor(c);
            
            z.pomik(korak);
            if (n==0){
                return;
            }
            Zelva leva=new Zelva(z.x, z.y, z.kot+45 );
            Zelva desna=new Zelva(z.x, z.y, z.kot+5);
            Zelva srednja=new Zelva(z.x, z.y, z.kot+25);
            drevo(n-1,leva,korak*1);
            drevo(n-1,desna,korak*1);
            drevo(n-1,srednja,korak*1);
        }
        public static void drevo2 (int n, Zelva z, double korak){
            //  StdDraw.setPenRadius(0.09*Math.pow(n-1,0.02));          
            // StdDraw.setPenColor(Color.yellow);
            Color c=new Color(n,255-50*n,0); // red green blue
            StdDraw.setPenColor(c);
            
            z.pomik(korak);
            if (n==0){
                return;
            }
            Zelva leva=new Zelva(z.x, z.y, z.kot-45 );
            Zelva desna=new Zelva(z.x, z.y, z.kot-5);
            Zelva srednja=new Zelva(z.x, z.y, z.kot-25);
            drevo(n-1,leva,korak*1);
            drevo(n-1,desna,korak*1);
            drevo(n-1,srednja,korak*1);
        }
        public static void antena(int n, double korak ,Zelva z ){
           
            if (n==0){
                z.pomik(korak);
                return;
            }
            antena(n-1, korak, z);
            z.obratLevo(90);
            antena(n-1, korak, z);
           z.obratpolni();
            antena(n-1, korak*2, z);
            z.obratpolni();
            antena(n-1, korak*2, z);
            z.obratDesno(90);
            // antena(n-1, korak, z);
            
        }
        public static void koch(int n,double korak,Zelva z){
            
            if (n==0){
                z.pomik(korak);
                return;
            }
            
            koch(n-1,korak,z);
            z.obratLevo(60);
            koch(n-1,korak,z);
            z.obratLevo(-120);
            koch(n-1,korak,z);
            z.obratLevo(60);
            koch(n-1,korak,z); 
        }
        
       
}

