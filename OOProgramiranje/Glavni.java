public class Glavni {
        public static void main(String[] args) {
            Student s = new Student(" miha novak");  // tko lahko naredis ce imas konstruktor
           // s.setIme("Miha novak");
           //  s.ime ="miha";    // lol ce je public ime , lahko naredis tako s.ime , zatonardis privbat in nardis getter in setter
            System.out.println("student se imenuje "+s.getIme()); 
            System.out.println("povprečna ocena je "+s.getPovprecnaOcena());
            // konstruktor se ne deduje
            IzredniStudent iz = new IzredniStudent("Janez Baney");
            System.out.println(iz.toString());

            System.out.println(s.toString());


        }
}
 // konstruktor se ne dedujee ampak se vedno izvede konstruktor baznega razreda brez parametrev.