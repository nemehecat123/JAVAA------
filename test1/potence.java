public class potence {
    public static void main(String[] args) {
        System.out.println(potenca(5, 2)); 
    }
    public static int potenca (int a, int n){
        if (n == 0)
          return 1;
        return a * potenca(a, n - 1);
      }
}
