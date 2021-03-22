// import java.awt.*;

// // import org.graalvm.compiler.graph.Graph;
// public class PanelZaRisanje {
//     public void riši1(Graphics g)
//     {
//         g.setColor(Color.BLACK);
//         g.fillRect(0,0, 400, 400);
//         g.setColor(Color.GREEN);
//         g.fillRect(100, 100, 200, 100);
//         g.setColor(Color.PINK);
//         g.fillRect(175, 150, 50, 50);
//         g.setColor(Color.yellow);
//         g.fillRect(150,125 , 20, 20);
//         g.fillRect(225,125, 20, 20);
//         g.setColor(Color.red);
//         g.fillArc(100, 100, 200, 50, 30, 30);
        
//     }
//     public void riši2(Graphics g)
//     {
//         g.setColor(Color.black);
//         for (int k=0;k<=10;k++)
//         {
//             g.drawRect(50+k*5, 50+k*5, 150-2*5*k, 150-2*5*k);
//         }
//     }
//     public void riši3(Graphics g,int x, int y,int širina, int višina)
//     {
//         g.setColor(Color.GREEN);
//         g.drawRect(x, y,višina, širina);
//         //+na koncu
//         g.setColor(Color.yellow);
//         g.fillOval(x, y, širina, višina);
//         g.setColor(Color.black);
//         for (int k =0;k<10;k++){
//             g.drawOval(x+k*5, y+k*5, širina-2*5*k, višina-2*5*k);
//         }
//         g.setColor(Color.green);
//         g.drawLine(x+širina/2, y , x+širina/2 ,y+višina);
//         g.drawLine(x, y+višina/2 , x+širina, y+višina/2);
//     }
//     public void riši4(Graphics g){
//     riši3(g,50,50,100,100);
//         //riši3(g,180,50,100,100);
//     for (int k =0;k<=4;k++){
//         riši3(g,180+36,50+36,100,100);
//         ri
        
//     }
//     }
// }
