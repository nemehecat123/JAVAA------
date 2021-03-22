public class Prosim {
    public static int StKraljic =4;

    public static void main(String[] args) {
        int [] board ={-1,-1,-1,-1};
       
        for (int k =0 ;k<StKraljic ;k++){
            board[0]=k;
            for(int j =0;j<StKraljic;j++){
                board[1]=j; 
                if (Pokriva(board, 1)) {
                    for(int i =0 ; i<StKraljic;i++){
                        board[2] =i;
                        if(Pokriva(board, 2)){
                            for(int l =0 ; l<StKraljic;l++){
                                board[3]=l;
                                if(Pokriva(board, 3)){
                                    narisi(board);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static boolean Pokriva(int board [], int StolpecKraljice){
        for(int k =0 ; k <StolpecKraljice;k++){
            //tle gre da  skozi vrsto!ni na isti liniji
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

    public static void narisi(int[] board){
        System.out.println("-...................");
        int n = board.length;
        for(int k =0 ;k<n;k++){
            for(int j : board){
                if (j==k){
                    System.out.print("k\t");
                }else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}