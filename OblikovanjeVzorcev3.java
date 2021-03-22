public class OblikovanjeVzorcev3 {
    public static void main(String[] args) {
        int ŠteviloVrstic =6;
        int stevilo =1;
        for (int k=0;k<=ŠteviloVrstic;k++){ // število vrstic...
            stevilo=1;
            for (int p=1;p<=ŠteviloVrstic-k;p++){
                System.out.print(" ");
            
            }
            for (int j =0;j<k;j++){

            System.out.printf("%d",stevilo);
            stevilo++;
            }
            
            System.out.println();
        }
       
    }
}
// {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter number of rows: "); // takes input from user

//     int rows = sc.nextInt();
     
//     for (int i= 0; i<= rows; i++)
//     {
//         for (int j=1; j<=rows-i; j++)
//         {
//             System.out.print(" ");
//         }
//         for (int k=0;k<=i;k++)
//         {
//             System.out.print("*");
//         } 
//             System.out.println("");
//     }
//     sc.close();

// }