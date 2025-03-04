public class Cajero {
    public static void main(String[] args) throws Exception {

        IManejador Dispensador100 = new Dispensador(100000);
        IManejador Dispensador50 = new Dispensador(50000);
        IManejador Dispensador20 = new Dispensador(20000);
        IManejador Dispensador10 = new Dispensador(10000);
        IManejador Dispensador5 = new Dispensador(5000);

        Dispensador100.setSiguienteMnj(Dispensador50);
        Dispensador50.setSiguienteMnj(Dispensador20);
        Dispensador20.setSiguienteMnj(Dispensador10);
        Dispensador10.setSiguienteMnj(Dispensador5);

        Dispensador100.procesarTransaccion(575000);
        System.out.println("-------------------------");
        Dispensador100.procesarTransaccion(57000);
        System.out.println("-------------------------");
        Dispensador100.procesarTransaccion(675000);
        System.out.println("-------------------------");
        Dispensador100.procesarTransaccion(832000);
        System.out.println("-------------------------");
        Dispensador100.procesarTransaccion(10000);
        System.out.println("-------------------------");
        Dispensador100.procesarTransaccion(5000); 
    }
}
