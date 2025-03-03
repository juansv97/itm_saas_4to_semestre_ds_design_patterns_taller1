
public class Dispensador implements IManejador {

    protected IManejador SiguienteMnj;//permite que cada manejador conozca quién es su sucesor en la cadena.
    protected int denominacion;

    public Dispensador(int denominacion) {

        this.denominacion = denominacion;// define el valor que manejara cada objeto 
    }

    @Override
    public void setSiguienteMnj(IManejador SiguienteMnj) {

        this.SiguienteMnj = SiguienteMnj;

    }// almacena el siguiente manejador en la cadena de responsabilidades

    @Override
    public void procesarTransaccion(int cantidad) {
        
      if (cantidad >= denominacion ) {

            int numEfectivo = cantidad / denominacion;
            int restante = cantidad % denominacion;

            System.out.println("Dispensanso " + numEfectivo + "billete de $" + denominacion);
            if (restante >= 0 && SiguienteMnj != null) {

                setSiguienteMnj.procesarTransaccion(restante);// pasamos el restante de la cantidad al siguiente manejador
            }  // si la cantidad es menor a la denominacion se pasa la siguiente manejador 
         } else if (SiguienteMnj != null) {

           setSiguienteMnj.procesarTransaccion(cantidad);

        }

    
}


}
