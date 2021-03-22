package pravokotnik;

public class kvadr extends pravokotnik {
        public kvadr(double višina,double dolžina, double širina) {
            super(dolžina  ,širina);
            this.višina=višina;
        }
        protected double višina;

        public double površina(){
            return 2*ploščina()+2*višina*a+2*b*višina;
        }
        public double volumen(){
            return a*b*višina;
        }
}
