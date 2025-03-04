public interface IManejador {

    public void setSiguienteMnj(IManejador siguienteMnj);

    public void procesarTransaccion( int cantidad );
}
