public interface IManejador {

    public void siguienteMnj(IManejador next);

    public void procesarTransaccion( int cantidad );
}
