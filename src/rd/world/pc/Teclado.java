package rd.world.pc;

public class Teclado extends DispositivoEntrada {

    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        
         //Imprime la informacion del objecto teclado, tambien los atributos de tipoEntrada y marca//
        return "Teclado{" + "idTeclado=" + idTeclado + ", " + super.toString() + '}';
    }

}
