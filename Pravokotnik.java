public class Pravokotnik 
{
    //lastnosti razreda
    double širina;
    double višina;
    //obnašanje
    public void izpis()//glava metode  ki samo nekaj naredi
    {
        System.out.print("širina je ");              //je zbrisala print ln, zato , da ji ne gre v naslednjo vrstico // brez metode main nebo bralo...
        System.out.println(širina);                 //nima znaka za dobesedni nagovor
        System.out.println("dolžina je "+višina);                // doda še tisto iz lasnotsi razreda izpis al neki... 
    }
    public double ploščina()                //metoda, ki nekaj vrne ( to lahko ugotoviš iz glave)
    {
        return širina*višina;
    }
    //konstruktor, ima posebno glavo! se klice enako ku program
    public Pravokotnik()  // pazi na oklepaje da jih dodas
    {
        širina=4;
        višina=5;
    }

}
