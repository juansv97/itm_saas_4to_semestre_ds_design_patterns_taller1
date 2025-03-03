public class App {
    public static void main(String[] args) throws Exception {

        IManejador Dispensador100 = new Dispensador(100000);
        IManejador Dispensador50 = new Dispensador(50000);
        IManejador Dispensador20 = new Dispensador(20000);
        IManejador Dispensador10 = new Dispensador(10000);
        IManejador Dispensador5 = new Dispensador(5000);

        Dispensador100.siguienteMnj(Dispensador50);
        Dispensador50.siguienteMnj(Dispensador20);
        Dispensador20.siguienteMnj(Dispensador10);
        Dispensador10.siguienteMnj(Dispensador5);

        Dispensador100.procesarTransaccion(575000);
        System.out.println("-------------------------");
        Dispensador100.procesarTransaccion(57000);
        System.out.println("-------------------------");
        Dispensador100.procesarTransaccion(675000);
        System.out.println("-------------------------");
        Dispensador100.procesarTransaccion(832000);
        System.out.println("-------------------------");
        Dispensador100.procesarTransaccion(10000);


       
    }
}