public class Kraljice{
    
    static void postavi(int[] board , int vrstaIskanja,int StKraljic){
        if(vrstaIskanja==StKraljic){
            narisi(board);
            return;
        }
        for(int i =0; i<StKraljic;i++){
            board[vrstaIskanja]=i;  // trnutno je vrstica  u kateri je
            if (Pokriva(board, vrstaIskanja)) {
                postavi(board, vrstaIskanja+ 1, StKraljic);
                
            }
        }
    }


    public static void narisi(int[] board){
        System.out.println("-...................");
        int n = board.length;
        for(int k =0 ;k<n;k++){
            for(int j : board){
                if (j==k){
                    System.out.print("k ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static boolean Pokriva(int board [], int StolpecKraljice){
        for(int k =0 ; k <StolpecKraljice;k++){
            //tle gre skozi stolpec da ni na isti liniji
            if (board[k]==board[StolpecKraljice]) {
                return false;
                
            }
            // tle je diagonala ?
            if ((StolpecKraljice-k) ==(Math.abs(board[StolpecKraljice]-board[k]))) {
                return false;
                
            }
        }
        return true;
    }
}

