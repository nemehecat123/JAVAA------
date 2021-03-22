public class UrejanjeZVvstavljanjem{

    public static void main(String[] args) {
        int tabela [] = {1,6,3,68,2,34,16,1354,};
        vstavljanje(tabela);
        izpis(tabela);
    }
    
    public static void vstavljanje(int[] a){

        for (int k =0;k<a.length;k++){
            // pogreznit kti element tako, da bo element od 0 do k urejenei
            int j=k;int temp =a[k];
            while(j>0&&a[j-1]>temp)
            {
                a[j]=a[j-1];
                j--;
            }
            // dobil sem mesto za element, ki ga vstavljam
            a[j] =temp;
            izpis(a);
        }


    }


    public static void izpis(int[] a)
{
 for(int k=0;k<a.length;k++)
   {
       
     System.out.print(a[k]+"\t");
     
     }   
 System.out.println();
}



}