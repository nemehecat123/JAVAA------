public class MutantMain {
    public static void main(String[] args) {
        Mutant a = new Mutant("Višji um",150 ,3);
        a.izpišiVse();
        System.out.println(a.izračunajKoeficient());
        Mutant b = new Mutant("POvprečen",100 ,7);
        b.izpišiVse();
        System.out.println(b.izračunajKoeficient());
    }
}
