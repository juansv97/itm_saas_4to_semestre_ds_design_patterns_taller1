public interface IManejador {

    public void setSiguienteMnj(IManejador next);

    public void procesarTransaccion( int cantidad );
}
