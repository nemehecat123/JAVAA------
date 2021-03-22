public class cifre {
    public static void main(String[] args) {
        vsota(345);
    }

    public static int vsota(int a){
        StringBuffer sb = new StringBuffer();
        String c =Integer.toString(a);
        sb.append(c);
        sb.reverse();
        String d=  sb.toString();
        int g=Integer.parseInt(d);
        System.out.println(g);
        return g;
    }
}
