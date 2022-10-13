public class Coche {
    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.Aumentar();
        micoche.Aumentar();
        System.out.println(micoche.puertas);
    }
    static class coche{
        public int puertas = 3;

        public void Aumentar(){
            this.puertas++;
        }
    }
}
